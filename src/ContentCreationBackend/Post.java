/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author yaras
 */
public class Post extends Content {

    private ArrayList<Post> postList = new ArrayList<>();

    public void addPost(Post p) {
        postList.add(p);
    }
    public void deletePost(Post p) {
        postList.remove(p);
    }

    public ArrayList<Post> getPosts() {
        // ArrayList<Post> posts = new ArrayList<>();
        for (Post p : postList) {
            postList.add(p);
        }
        return postList;
    }
}