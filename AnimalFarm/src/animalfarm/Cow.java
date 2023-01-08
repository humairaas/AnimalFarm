package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Cow extends Decoration {

    public Cow() {
        name = "cow";
        image = new ImageIcon("res/cow.png");
        // audio = "moo";
        }

    public ImageIcon getCow() {
        return image;
    }
}
