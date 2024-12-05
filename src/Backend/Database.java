/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;

/**
 *
 * @author daree
 */
public class Database {
    
    String filename;
    JSONArray jsonArray;
    
    public void saveFile(String filename,JSONArray jsonArray)
    {
        try {
            FileWriter file = new FileWriter(filename) ;
            file.write(jsonArray.toString(4));
            
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public JSONArray loadFile(String filename)
    {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            return new JSONArray(content);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }
    
}
