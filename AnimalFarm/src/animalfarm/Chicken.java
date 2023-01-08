package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Chicken extends Decoration {

    public Chicken() {
        name = "chicken";
        image = new ImageIcon("res/chicken.png");
        // audio = "moo";
        }

    public ImageIcon getChicken() {
        return image;
    }
}
