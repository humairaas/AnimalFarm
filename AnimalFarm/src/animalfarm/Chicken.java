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
    }
}
