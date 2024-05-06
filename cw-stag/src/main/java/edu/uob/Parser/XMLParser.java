package edu.uob.Parser;

import edu.uob.GameAction;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class XMLParser {

    public void parseXML(String actionsFile) {

        HashMap<String, HashSet<GameAction>> gameMap = new HashMap<>();


        // Get the document in the Document Builder:
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Get Document
            Document actionFile = builder.parse(actionsFile);
            // Normalise the XML Structure:
            Element root = actionFile.getDocumentElement();
            // Get the actions
            if (root.getChildNodes().equals("action")) {
                NodeList actionNodes = root.getElementsByTagName("action");
                for (int i = 0; i < actionNodes.getLength(); i++) {
                    Element actionElement = (Element) actionNodes.item(i);
                    // HashSet for storing trigger keywords:
                    HashSet<String> triggers = new HashSet<>();
                    NodeList triggerNodes = actionElement.getElementsByTagName("triggers");
                    for (int j = 0; j < triggerNodes.getLength(); j++) {
                        // check that the element type is of ELEMENT
                        if (triggerNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            triggers.add(triggerNodes.item(j).getTextContent());
                        }
                    }

                    // HashSet for produced keywords:
                    HashSet<String> subjects = new HashSet<>();
                    NodeList producedList = actionElement.getElementsByTagName("produced").

                    GameAction gameActions = new GameAction(produced, subjects, consumed, narration);
                    for (String trigger : triggers) {
                        gameMap.computeIfAbsent(trigger, k -> new HashSet<>()).add(gameActions);
                    }
                }
            }



            else {
                System.out.println("action list not found in map");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}



