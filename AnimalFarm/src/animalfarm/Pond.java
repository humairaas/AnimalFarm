package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Pond extends Decoration {

    public Pond() {
        name = "pond";
        image = new ImageIcon("res/pond.png");
    }

    public ImageIcon getPond() {
        return image;
    }
    
}
