package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Sheep extends Decoration {

    public Sheep() {
        name = "sheep";
        image = new ImageIcon("res/sheep.png");
        // audio = "moo";
        }

    public ImageIcon getSheep() {
        return image;
    }
}