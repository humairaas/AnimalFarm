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
        cost = 40;
        sellPrice = 0; // Farmer don't get anything for selling a horse
    }

    public ImageIcon getHorse() {
        return image;
    }
}
