/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
/**
 *
 * @author yaras
 */
public abstract class Content {
    String contendID;
    String authorID;
    String content;
    LocalDateTime timestamp;

    public Content( String authorID, String content, LocalDateTime timestamp) {
        contendID = UUID.randomUUID().toString();
        this.authorID = authorID;
        this.content = content;
        this.timestamp = timestamp;
    }
    
    public String getContendID() {
        return contendID;
    }

    public void setContendID(String contendID) {
        this.contendID = contendID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}