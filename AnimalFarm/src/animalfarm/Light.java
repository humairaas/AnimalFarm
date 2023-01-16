package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Light extends Decoration {

    public Light() {
        name = ElementEnum.LIGHT;
        image = new ImageIcon("res/lamp_sun.png");
    }

    public ImageIcon getLights() {
        return image;
    }
    
}
