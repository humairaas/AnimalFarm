package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Coop extends Decoration {

    public Coop() {
        name = "coop";
        image = new ImageIcon("res/coop.png");
    }

    public ImageIcon getCoop() {
        return image;
    }
    
}
