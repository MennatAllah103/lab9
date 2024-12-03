/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContentCreationBackend;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author yaras
 */
public class Story extends Content implements StoryExpire {

    public Story(String authorID, String content, LocalDateTime timestamp) {
        super(authorID, content, timestamp);
    }

    @Override
    public boolean isExpired() {
        if (Duration.between(getTimestamp(), LocalDateTime.now()).toHours() >= 24) {
            return true;
        }
        return false;
    }
}
