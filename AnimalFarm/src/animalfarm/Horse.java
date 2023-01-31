package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Horse extends Animal {

    public Horse() {
        name = ElementEnum.HORSE;
        image = new ImageIcon("res/horse.gif");
        audio = "res/horse.wav";
    }

    public ImageIcon getHorse() {
        return image;
    }
}
