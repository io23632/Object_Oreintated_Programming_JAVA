package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/*
* 1. Get the document in the Document Builder
* 2. Get Document
* 3. Normalise the xml structure
* 4. Get all the elements by the tag name
*
* */

public class Main {
    static HashMap<String, Laptop> laptops = new HashMap<>();
    String price;
    public static void main(String[] args) {
        File parsingFile = Paths.get("config" + File.separator + "laptops.xml").toAbsolutePath().toFile();
        // 1. Get the document in the Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            // 2. Get Document
            Document document = builder.parse(parsingFile);
            // 3. Normalise the xml structure
            document.getDocumentElement().normalize();
            // 4. Get elements
           NodeList laptopList = document.getElementsByTagName("laptop");
            // This returns a Node List, i.e. this will return all Laptop Nodes
            // Retrieve the elements in the list, i.e. name, price, ram, ssd,
           for (int i = 0; i < laptopList.getLength(); i++ ) {
                Node laptop = laptopList.item(i);
                // Check that what you are retrieving is a ELEMENT
               if (laptop.getNodeType() == Node.ELEMENT_NODE) {
                   Element laptopElement = (Element) laptop;
                   String name = laptopElement.getAttribute("name");
                   String price = laptopElement.getElementsByTagName("price").item(0).getAttributes().getNamedItem("value").getNodeValue();
                   String ram = laptopElement.getElementsByTagName("ram").item(0).getAttributes().getNamedItem("value").getNodeValue();

                   String storageType;
                   if (laptopElement.getElementsByTagName("ssd").getLength() > 0) {
                       storageType = laptopElement.getElementsByTagName("ssd").item(0).getAttributes().getNamedItem("value").getNodeValue();
                   } else {
                       storageType = laptopElement.getElementsByTagName("hardDrive").item(0).getAttributes().getNamedItem("value").getNodeValue();
                   }
                   Laptop lap = new Laptop(name, price, ram, storageType);
                   laptops.put(name, lap);
               }
           }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
           e.printStackTrace();
        }

        for (String name : laptops.keySet()) {
            Laptop myLaptop = getLaptopByName(name);
            String ram = myLaptop.getRam();
            switch (ram) {
                case "8GB":
                    System.out.println(name + " This is not a lot of Ram");
                    break;
                case "250GB" :
                    System.out.println(name + " That's more like it");
                    break;
                default:
                    System.out.println("Unrecognised Ram");
            }
        }
    }


    // Method to retrieve Laptop object by name
    public static Laptop getLaptopByName(String name) {
        return laptops.get(name);
    }
    // Method to check if Laptop is expensive :
    public static void checkPrice(Laptop lap) {
        if (Integer.parseInt(lap.getPrice()) > 3000) {
            System.out.println(lap.getName() + " is expensive");
        }
    }
}