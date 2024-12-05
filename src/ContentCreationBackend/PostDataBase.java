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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PostDataBase {

    ArrayList<Post> posts = new ArrayList<>();

    public void SavePostsToFile(ArrayList<Post> post) {
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
    }

    public ArrayList<Post> ReadPostsFromFile() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("posts.json")));
            JSONArray postsArray = new JSONArray(json);
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
            for (int i = 0; i < postsArray.length(); i++) {
                JSONObject postJson = postsArray.getJSONObject(i);
                String contentID = postJson.getString("contentID");
                String authorID = postJson.getString("authorID");
                String content = postJson.getString("content");
                String timeStamp = postJson.getString("timeStamp");
                Post post = new Post();
                post.setContentID(contentID);
                post.setAuthorID(authorID);
                post.setContent(content);
                post.setTimestamp(LocalDateTime.parse(timeStamp, formatter));
                posts.add(post);          
            }
        } catch (IOException e) {
            System.err.println("Error reading posts from file: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Error parsing JSON data: " + e.getMessage());
        }
        return posts;
    }

    public void removedPosts(String contentID) {
        posts = ReadPostsFromFile(); // Load posts
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getContentID().equals(contentID)) {
                posts.remove(i); // Remove the post by matching ID
                break; // Exit the loop once the post is found and removed
            }
        }
        SavePostsToFile(posts); // Save back to file
    }

}