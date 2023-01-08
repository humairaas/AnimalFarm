package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Duck extends Decoration {

    public Duck() {
        name = "duck";
        image = new ImageIcon("res/duck.png");
        // audio = "quack quack";
        }

    public ImageIcon getDuck() {
        return image;
    }
}
