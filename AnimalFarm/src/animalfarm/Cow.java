package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Cow extends Animal {

    public Cow() {
        name = ElementEnum.COW;
        image = new ImageIcon("res/cow.gif");
        audio = "res/cow-mooing.wav";
        cost = 20;
        sellPrice = 30;
    }

    public ImageIcon getCow() {
        return image;
    }
}
