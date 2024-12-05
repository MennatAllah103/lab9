package ContentCreationBackend;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author yaras
 */
public class Story extends Content {

    private ArrayList<Story> storyList = new ArrayList<>();

    public void addStory(Story s) {
        storyList.add(s);
    }

    public ArrayList<Story> getStories() {
        //   ArrayList<Story> stories = new ArrayList<>();
        for (Story s : storyList) {
            if (!s.isExpired()) {
                storyList.add(s);
            } else {
                deleteStory(s);
            }
        }
        return storyList;
    }

    public boolean isExpired() {
        return Duration.between(getTimestamp(), LocalDateTime.now()).toHours() >= 24;
    }

    public void deleteStory(Story s) {
        storyList.remove(s);
        // ArrayList<Story> expiredStories = new ArrayList<>();
//        for (Story s : expiredStories) {
//            if (s.isExpired()) {
//                expiredStories.add(s);
//            }
//
//        }
//        storyList.removeAll(expiredStories);
    }
}