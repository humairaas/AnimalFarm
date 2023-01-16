package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class Delete extends Decoration {

    public Delete() {
        name = ElementEnum.DELETE;
    }

    public ImageIcon getDelete() {
        image = new ImageIcon("res/delete.png");
        return image;
    }
    
}
