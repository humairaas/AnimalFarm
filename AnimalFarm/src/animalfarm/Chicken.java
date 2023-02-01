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
        cost = 2;
        sellPrice = 3;
    }

    public ImageIcon getChicken() {
        return image;
    }
}
