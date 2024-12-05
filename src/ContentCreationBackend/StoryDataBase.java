/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yaras
 */
public class StoryDataBase {

    ArrayList<Story> stories = new ArrayList<>();

    public void SaveStoriesToFile(ArrayList<Story> story) {
        JSONArray storiesArray = new JSONArray();
        for (Story s : story) {
            if (!s.isExpired()) {
                JSONObject j = new JSONObject();
                j.put("contentID", s.getContentID());
                j.put("authorID", s.getAuthorID());
                j.put("content", s.getContent());
                j.put("timeStamp", s.getTimestamp());
                storiesArray.put(j);
            }
        }
        try {
            FileWriter file = new FileWriter("stories.json");
            file.write(storiesArray.toString());
            file.close();
        } catch (IOException ex) {
            //Logger.getLogger(StoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error saivng stories to file.");
        }
    }
public ArrayList<Story> ReadStoriesFromFile() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("stories.json")));
            JSONArray storiesArray = new JSONArray(json);
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
            for (int i = 0; i < storiesArray.length(); i++) {
                JSONObject storyJson = storiesArray.getJSONObject(i);
                String contentID = storyJson.getString("contentID");
                String authorID = storyJson.getString("authorID");
                String content = storyJson.getString("content");
                String timeStamp = storyJson.getString("timeStamp");
                stories.add(new Story());
            }
        } catch (IOException e) {
            System.err.println("Error reading stories from file: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Error parsing JSON data: " + e.getMessage());
        }
        return stories;
    }

    public void removedstories(String contentID) {
        stories = ReadStoriesFromFile(); // Load stories
        for (int i = 0; i < stories.size(); i++) {
            if (stories.get(i).getContentID().equals(contentID) || stories.get(i).isExpired()) {
                stories.remove(i); // Remove the story by matching ID
                break; // Exit the loop once the story is found and removed
            }
        }
        SaveStoriesToFile(stories); // Save back to file
    }
}
