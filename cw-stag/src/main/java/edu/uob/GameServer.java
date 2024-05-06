package edu.uob;

import edu.uob.GameEntities.Artefacts;
import edu.uob.GameEntities.Locations;
import edu.uob.Parser.DotParser;
import edu.uob.Parser.XMLParser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public final class GameServer {
    private static final char END_OF_TRANSMISSION = 4;
    DotParser dotParser = new DotParser();
    XMLParser xmlParser = new XMLParser();

    public static void main(String[] args) throws IOException {
        File entitiesFile = Paths.get("config" + File.separator + "basic-entities.dot").toAbsolutePath().toFile();
        File actionsFile = Paths.get("config" + File.separator + "basic-actions.xml").toAbsolutePath().toFile();
        GameServer server = new GameServer(entitiesFile, actionsFile);
        server.blockingListenOn(8888);
    }

    /**
    * Do not change the following method signature or we won't be able to mark your submission
    * Instanciates a new server instance, specifying a game with some configuration files
    *
    * @param entitiesFile The game configuration file containing all game entities to use in your game
    * @param actionsFile The game configuration file containing all game actions to use in your game
    */
    public GameServer(File entitiesFile, File actionsFile) {
        // TODO implement your server logic here
        // Convert the entitiesFile Path to string;
        String dotFile = entitiesFile.toString();
        String xmlFile = actionsFile.toString();
        dotParser.parseFile(dotFile);
        xmlParser.parseXML(xmlFile);
    }


    // Method to move artefact from one Location to next:
    public void moveArteFact(String fLocation, String tLocation, String artefactName) {
        Locations fromLocation = dotParser.getLocations().get(fLocation);
        Locations toLocation = dotParser.getLocations().get(tLocation);
        if (checkLocationIsNotNull(fromLocation) && checkLocationIsNotNull(toLocation)) {

            Artefacts artefact = fromLocation.getArtefacts().remove(artefactName);
            if (artefact != null) {
                toLocation.getArtefacts().put(artefactName, artefact);
                seeArtefacts(tLocation);
            }
            else {
                System.out.println("Artefact does not exists in location");
            }
        }
    }

    // Method to check if location is null
    public boolean checkLocationIsNotNull(Locations locationName) {
        if (locationName != null) {
            return  true;
        }
        else {
            System.out.println("Location " + locationName + " does not exists");
            return false;
        }
    }

    // Method to see the artefacts in a specified location:
    public void seeArtefacts(String name){
        Locations locations = dotParser.getLocations().get(name);
        HashSet<String> artefactsInLocations = new HashSet<>();
        if (locations != null) {
           artefactsInLocations.add(locations.getArtefacts().keySet().toString());
        }
        artefactsInLocations.forEach(System.out::println);
    }

    // Method to return the accessible locations
    public Set<String> seeAccessibleLocations(String name){
        Locations locations = dotParser.getLocations().get(name);
        // Create a new HashSet to store the accessible locations returned into;
        HashSet<String> acceessibleLocationsNames = new HashSet<>();
        if (locations != null){
            for(Locations accessibleLocations: locations.getAccessibleLocations()) {
                acceessibleLocationsNames.add(accessibleLocations.getName());
            }
        }
        else {
            System.out.println("Location " + name + " does not exist");
        }
        return acceessibleLocationsNames;
    }





    /**
    * Do not change the following method signature or we won't be able to mark your submission
    * This method handles all incoming game commands and carries out the corresponding actions.</p>
    *
    * @param command The incoming command to be processed
    */
    public String handleCommand(String command) {
        // TODO implement your server logic here
        return "";
    }

    /**
    * Do not change the following method signature or we won't be able to mark your submission
    * Starts a *blocking* socket server listening for new connections.
    *
    * @param portNumber The port to listen on.
    * @throws IOException If any IO related operation fails.
    */
    public void blockingListenOn(int portNumber) throws IOException {
        try (ServerSocket s = new ServerSocket(portNumber)) {
            System.out.println("Server listening on port " + portNumber);
            while (!Thread.interrupted()) {
                try {
                    blockingHandleConnection(s);
                } catch (IOException e) {
                    System.out.println("Connection closed");
                }
            }
        }
    }

    /**
    * Do not change the following method signature or we won't be able to mark your submission
    * Handles an incoming connection from the socket server.
    *
    * @param serverSocket The client socket to read/write from.
    * @throws IOException If any IO related operation fails.
    */
    private void blockingHandleConnection(ServerSocket serverSocket) throws IOException {
        try (Socket s = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            System.out.println("Connection established");
            String incomingCommand = reader.readLine();
            if(incomingCommand != null) {
                System.out.println("Received message from " + incomingCommand);
                String result = handleCommand(incomingCommand);
                writer.write(result);
                writer.write("\n" + END_OF_TRANSMISSION + "\n");
                writer.flush();
            }
        }
    }
}
