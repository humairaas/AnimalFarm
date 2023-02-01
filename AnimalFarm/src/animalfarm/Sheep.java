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
        audio = "res/sheep.wav";
        cost = 10;
        sellPrice = 15;
    }

    public ImageIcon getSheep() {
        return image;
    }
}
