package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Feed extends Decoration {

    public Feed() {
        name = ElementEnum.FEED;
    }

    public ImageIcon getFeed() {
        image = new ImageIcon("res/feed.png");
        return image;
    }
    
}
