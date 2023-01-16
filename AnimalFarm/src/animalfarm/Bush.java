package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Bush extends Decoration {

    public Bush() {
        name = ElementEnum.BUSH;
        image = new ImageIcon("res/bush.png");
    }

    public ImageIcon getBush() {
        return image;
    }
    
}
