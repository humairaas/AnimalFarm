package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Cow extends Animal {

    public Cow() {
        name = ElementEnum.COW;
        image = new ImageIcon("res/cow.png");
        // audio = "moo";
        }

    public ImageIcon getCow() {
        return image;
    }
}
