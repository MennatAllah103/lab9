/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.time.LocalDateTime;

/**
 *
 * @author yaras
 */
public class Post extends Content{
    
    public Post(String authorID, String content, LocalDateTime timestamp) {
        super(authorID, content, timestamp);
    }
    
}
