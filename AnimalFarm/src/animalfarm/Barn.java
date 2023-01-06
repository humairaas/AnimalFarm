package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Barn extends Decoration {

    public Barn() {
        name = "barn";
        image = new ImageIcon("res/barn.png");
    }

    public ImageIcon getBarn() {
        return image;
    }
    
}
