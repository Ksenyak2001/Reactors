/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mavenproject1.readers;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import mephi2023.mavenproject1.workWithCollection.Reactor;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Kseny
 */
public class ReaderXML {
    public static void read(String fileName, ArrayList<Reactor> collection) throws SAXException, IOException, ParserConfigurationException {
        String source = "xml";
        fileName = "file:\\" + fileName;
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        org.w3c.dom.Document document = documentBuilder.parse(fileName);
        NodeList reactorsList = document.getDocumentElement().getChildNodes();
        System.out.println(source);
        for (int i = 0; i < reactorsList.getLength(); i++) {
            Node r = reactorsList.item(i);
            if (r.getNodeType() != Node.TEXT_NODE) {
                NodeList rParams = r.getChildNodes();
                ArrayList<String> info = new ArrayList<>();
                for(int j = 0; j < rParams.getLength(); j++) {
                    Node param = rParams.item(j);
                    if (param.getNodeType() != Node.TEXT_NODE) {info.add(param.getChildNodes().item(0).getTextContent());}
                }
                collection.add(new Reactor(info, source));
            }
        }
    }
}
