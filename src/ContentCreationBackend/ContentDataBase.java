/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

/**
 *
 * @author yaras
 */
import java.util.ArrayList;
import java.util.List;

public class ContentDataBase {

    private ArrayList<Content> contentList = new ArrayList<>();

    public void addContent(Content content) {
        contentList.add(content);
    }

    public ArrayList<Content> getAllContents() {
        return new ArrayList<>(contentList);
    }

    public ArrayList<Content> getPosts() {
        ArrayList<Content> posts = new ArrayList<>();
        for (Content content : contentList) {
            if (content instanceof Post) {
                posts.add(content);
            }
        } 
        return posts;
    }
    public ArrayList <Content> getStories(){
        ArrayList<Content> stories = new ArrayList<>();
        for(Content content : contentList){
            if (content instanceof Story){
                Story story = (Story) content;
                if (!story.isExpired())
                {
                    stories.add(content);
                }
            }
        }
        return stories;
    }
}
