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
        // audio = "quack quack";
        }

    public ImageIcon getDuck() {
        return image;
    }
}
