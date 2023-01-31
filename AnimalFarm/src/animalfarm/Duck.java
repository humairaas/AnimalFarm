package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Duck extends Animal {

    public Duck() {
        name = ElementEnum.DUCK;
        image = new ImageIcon("res/duck.gif");
        audio = "res/duck-quacking.wav";
    }

    public ImageIcon getDuck() {
        return image;
    }
}
