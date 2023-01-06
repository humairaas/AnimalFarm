package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Lights extends Decoration {

    public Lights() {
        name = "lights";
        image = new ImageIcon("res/lamp_sun.png");
    }

    public ImageIcon getLights() {
        return image;
    }
    
}
