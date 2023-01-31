package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Chicken extends Animal {

    public Chicken() {
        name = ElementEnum.CHICKEN;
        image = new ImageIcon("res/chicken.gif");
        audio = "res/chicken.wav";
    }

    public ImageIcon getChicken() {
        return image;
    }
}
