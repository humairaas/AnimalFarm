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
    }

    public ImageIcon getCow() {
        return image;
    }
}
