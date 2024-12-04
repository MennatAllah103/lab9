/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FriendManagementBackend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author daree
 */
public class FriendsDatabase {
    
    ArrayList<Friends> friends=new ArrayList<>();
   
    public ArrayList<Friends> loadFile(){ 
           try {
          String  json = new String(Files.readAllBytes(Paths.get("users.json")));
            JSONArray friendsArray = new JSONArray(json);
             for (int i = 0; i < friendsArray.length(); i++)
    {
        JSONObject friendsJson = friendsArray.getJSONObject(i);
                String Userid1  = friendsJson.getString("Userid1");
                String Userid2  = friendsJson.getString("Userid2");
                friends.add(new Friends(Userid1,Userid2));
    }
        } catch (IOException ex) {
            Logger.getLogger(FriendsDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return null;

}
 
    public void saveFile(ArrayList<Friends> friends)
    {
        
    }
    
}