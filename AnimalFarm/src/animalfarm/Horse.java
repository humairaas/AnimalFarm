package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Horse extends Decoration {

    public Horse() {
        name = "horse";
        image = new ImageIcon("res/horse.png");
        // audio = "reeeee";
        }

    public ImageIcon getHorse() {
        return image;
    }
}
