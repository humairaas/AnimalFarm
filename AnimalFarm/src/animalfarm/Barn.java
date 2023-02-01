package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Barn extends Decoration {

    public Barn() {
        name = ElementEnum.BARN;
        image = new ImageIcon("res/barn.png");
        cost = 50;
    }
    
}
