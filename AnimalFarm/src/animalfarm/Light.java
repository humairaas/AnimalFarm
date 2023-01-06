package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Light extends Decoration {

    public Light() {
        name = "lights";
        image = new ImageIcon("res/lamp_sun.png");
    }

    public ImageIcon getLights() {
        return image;
    }
    
}
