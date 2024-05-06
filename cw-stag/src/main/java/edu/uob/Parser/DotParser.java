package edu.uob.Parser;

/*
* 1. Get Locations
* 2. Get What's inside the cabin: Furniture and Artefacts
* 3. Get What is inside those attributes:
* */

/*
* Store the locations in a HashMap<locationName, locationClass> Each Location has a sub-graphs within called artefacts, and furniture and characters
* */

import com.alexmerz.graphviz.ParseException;
import com.alexmerz.graphviz.Parser;
import com.alexmerz.graphviz.objects.Edge;
import com.alexmerz.graphviz.objects.Graph;
import com.alexmerz.graphviz.objects.Node;
import edu.uob.GameEntities.Artefacts;
import edu.uob.GameEntities.Character;
import edu.uob.GameEntities.Furniture;
import edu.uob.GameEntities.Locations;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DotParser {
    private final HashMap<String, Locations> locations = new HashMap<>();
    private final HashMap<String, HashSet<String>> accessibleLocations = new HashMap<>();


    public void parseFile(String dotFile) {
        try {
            Parser parser = new Parser();
            FileReader reader = new FileReader(dotFile);
            parser.parse(reader);
            // Retrieve the whole Document:
            Graph wholeDocument = parser.getGraphs().get(0);
            // Retrieve just the Locations Graphs
            Graph graphLocations = wholeDocument.getSubgraphs().get(0);
            Graph Paths = wholeDocument.getSubgraphs().get(1);
            getLocations(graphLocations);
            getPaths(Paths);
            linkLocations();
        } catch (FileNotFoundException | ParseException e) {
            throw new RuntimeException(e);
        }
    }


    // A function to retrieve the attributes of the locations, instantiating a new Location object and then fulfilling it with the artefacts, furniture and character
    private void getLocations(Graph locationsMap) {

        for (Graph cluster : locationsMap.getSubgraphs()) {
            // Location Nodes: cabin [description: ""];
            Node nodes = cluster.getNodes(false).get(0);
            // Location names: cabin, forest ..
            String locationName = nodes.getId().getId();
            // cluster descriptions
            String description = nodes.getAttribute("description");
            // populate the cluster class with the names and description of cluster
            Locations myLocation = new Locations(locationName, description);
            for (Graph subGraph : cluster.getSubgraphs()) {
                getLocationAttributes(subGraph, myLocation);
            }
            // Store this in a Hash Map
            locations.put(myLocation.getName(), myLocation);



            }
        }

    /* For each Location now access the artefacts attribute and store populate the
     * HashMap<String, Attribute> HashMap in Locations class
     */


    // Extract Entities:
    private void getLocationAttributes(Graph subGraph, Locations location) {
        String type = subGraph.getId().getId(); // This should match 'artefacts', 'furniture',  or 'characters'
        List<Node> entities = subGraph.getNodes(false);
        for (Node entity : entities) {
            String entityName = entity.getId().getId();
            String entityDescription = entity.getAttribute("description");
            switch (type) {
                case "artefacts":
                    Artefacts newArtefact = new Artefacts(entityName, entityDescription);
                    location.getArtefacts().put(entityName, newArtefact);
                    break;
                case "furniture":
                    Furniture newFurniture = new Furniture(entityName, entityDescription);
                    location.getFurniture().put(entityName, newFurniture);

                    break;
                case "characters":
                    Character characters = new Character(entityName, entityDescription);
                    location.getCharacters().put(entityName, characters);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
        }
    }

    private void getPaths(Graph pathGraph) {
        List<Edge> edges = pathGraph.getEdges();
        for (Edge edge : edges) {
            // Location class now contains:     private HashMap<String, Character> characters = new HashMap<>();
            // For a given location, set the accessible locations given the Paths Graph and store in this HashMap
            String from = edge.getSource().getNode().getId().getId();
            String to = edge.getTarget().getNode().getId().getId();
            accessibleLocations.computeIfAbsent(from, k -> new HashSet<>()).add(to);
        }


    }

    private void linkLocations() {
        for (Map.Entry<String, HashSet<String>> entry : accessibleLocations.entrySet()) {
            Locations fromLocation = locations.get(entry.getKey());
            if (fromLocation != null) {
                for (String to : entry.getValue()) {
                    Locations toLocation = locations.get(to);
                    if (toLocation != null) {
                        fromLocation.getAccessibleLocations().add(toLocation);
                    } else {
                        System.err.println("Referenced location does not exist: " + to);
                    }
                }
            } else {
                System.err.println("Referenced location does not exist: " + entry.getKey());
            }
        }
    }
    public HashMap<String, Locations> getLocations() {
            return locations;
        }

        public HashMap<String, HashSet<String>> getAccessibleLocations() {
            return accessibleLocations;
        }



}


