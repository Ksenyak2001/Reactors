/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.mavenproject1.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mephi2023.mavenproject1.workWithCollection.Reactor;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Kseny
 */
public class ReaderYAML {
    public static void read(String fileName, ArrayList<Reactor> collection) throws FileNotFoundException{
        String source = "yaml";
        InputStream inputStream = new FileInputStream(new File(fileName));
        Yaml yaml = new Yaml();
        ArrayList<LinkedHashMap<String,Object>> data = yaml.load(inputStream);
        for (LinkedHashMap<String,Object> d: data){
            collection.add(new Reactor(d, source));
        }
    }
}
