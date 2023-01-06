package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Haystack extends Decoration {

    public Haystack() {
        name = "haystack";
        image = new ImageIcon("res/haystack.png");
    }

    public ImageIcon getHaystack() {
        return image;
    }

}
