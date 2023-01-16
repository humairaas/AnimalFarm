package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Coop extends Decoration {

    public Coop() {
        name = ElementEnum.COOP;
        image = new ImageIcon("res/coop.png");
    }

    public ImageIcon getCoop() {
        return image;
    }
    
}
