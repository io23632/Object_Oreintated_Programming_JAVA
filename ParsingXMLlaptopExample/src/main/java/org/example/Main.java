package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       File laptopFilePath = Paths.get("config" + File.separator + "laptops.xml").toAbsolutePath().toFile();
       String laptopFile = laptopFilePath.toString();

        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(laptopFile);
            NodeList laptopNodes = document.getElementsByTagName("laptop");
            HashSet<String> laptopNames = new HashSet<>();
            for (int i = 0; i < laptopNodes.getLength(); i++) {
                Element laptops = (Element) laptopNodes.item(i);
                laptopNames.add(laptops.getAttribute("name"));
                HashSet<String> priceList = new HashSet<>();

            }










        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }


    }
}