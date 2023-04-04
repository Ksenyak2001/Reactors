/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mavenproject1;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Kseny
 */
public class DataManipulation {

    private final ArrayList<Reactor> reactorsXML;
    private final ArrayList<Reactor> reactorsYAML;
    private final ArrayList<Reactor> reactorsJSON;
    
    public DataManipulation(){
        reactorsXML = new ArrayList<>();
        reactorsYAML = new ArrayList<>();
        reactorsJSON = new ArrayList<>();
    }
    
    
    public void readFromJSON(String fileName) throws FileNotFoundException, IOException, ParseException{
        String source = "json"; 
        JSONArray jsonArray = (JSONArray) new JSONParser().parse(new FileReader(fileName));
        for (int i = 0; i < jsonArray.size(); i++) {
            Reactor newReactor = new Gson().fromJson(jsonArray.get(i).toString(), Reactor.class);
            newReactor.setSource(source);
            reactorsJSON.add(newReactor);
        }
    }
    public void readFromXML(String fileName) throws SAXException, IOException, ParserConfigurationException {
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
                reactorsXML.add(new Reactor(info, source));
            }
        }
    }
    public void readFromYAML(String fileName) throws FileNotFoundException{
        String source = "yaml";
        InputStream inputStream = new FileInputStream(new File(fileName));
        Yaml yaml = new Yaml();
        ArrayList<LinkedHashMap<String,Object>> data = yaml.load(inputStream);
        for (LinkedHashMap<String,Object> d: data){
            reactorsYAML.add(new Reactor(d, source));
        }
    }
    public void clearCollections(){
        this.reactorsJSON.clear();
        this.reactorsXML.clear();
        this.reactorsYAML.clear();
    }
    
    public DefaultMutableTreeNode addInfoToTree(){
        ArrayList<Reactor> reactors = new ArrayList<>();
        if (!reactorsJSON.isEmpty()){
            reactors = reactorsJSON;
        } else if (!reactorsYAML.isEmpty()){
            reactors = reactorsYAML;
        } else if (!reactorsXML.isEmpty()){
            reactors = reactorsXML;
        } else {
            
        }
        DefaultMutableTreeNode main = new DefaultMutableTreeNode("Реакторы");
        for (Reactor r: reactors){
            main.add(r.getNode());
        }
        return main;
    }
}
