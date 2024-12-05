/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author yaras
 */
public class StoryDataBase {

    ArrayList<Story> stories = new ArrayList<>();

    public void SaveStoryToFile(ArrayList<Story> story) {
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
            System.out.println("Error saivng posts to file.");
        }
    }

}
