package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Sheep extends Animal {

    public Sheep() {
        name = "sheep";
        image = new ImageIcon("res/sheep.png");
        // audio = "moo";
        }

    public ImageIcon getSheep() {
        return image;
    }
}
