package edu.uob.GameEntities;

import edu.uob.GameEntity;

import java.util.HashMap;
import java.util.HashSet;

public class Locations extends GameEntity {
    private HashMap<String, Artefacts> artefacts = new HashMap<>();
    private HashMap<String, Furniture> furniture = new HashMap<>();
    private HashMap<String, Character> characters = new HashMap<>();

    private HashSet<Locations> accessibleLocations = new HashSet<>();


    public Locations(String name, String description) {
        super(name, description);
    }
   public HashMap<String, Artefacts> getArtefacts(){
        return artefacts;
   }
   public HashMap<String, Furniture> getFurniture() {
        return furniture;
   }
   public HashMap<String, Character> getCharacters(){
        return characters;
   }

   public HashSet<Locations> getAccessibleLocations(){
        return accessibleLocations;
   }


}
