package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Sheep extends Animal {

    public Sheep() {
        name = ElementEnum.SHEEP;
        image = new ImageIcon("res/sheep.gif");
        // audio = "moo";
        }

    public ImageIcon getSheep() {
        return image;
    }
}
