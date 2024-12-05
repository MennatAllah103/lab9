/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

/**
 *
 * @author yaras
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class PostDataBase {

    ArrayList<Post> posts = new ArrayList<>();

    public void SavePostToFile(ArrayList<Post> post) {
        JSONArray postsArray = new JSONArray();
        for (Post p : post) {
            JSONObject j = new JSONObject();
            j.put("contentID", p.getContentID());
            j.put("authorID", p.getAuthorID());
            j.put("content", p.getContent());
            j.put("timeStamp", p.getTimestamp());
            postsArray.put(j);
        }
        try {
            FileWriter file = new FileWriter("posts.json");
            file.write(postsArray.toString(4));
            file.close();
        } catch (IOException ex) {
            System.out.println("Error saivng posts to file.");
            // Logger.getLogger(PostDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        public ArrayList<Post> ReadPostFromFile()
        {
            
        }

    }
}
