package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Haystack extends Decoration {

    public Haystack() {
        name = ElementEnum.HAYSTACK;
        image = new ImageIcon("res/haystack.png");
    }

    public ImageIcon getHaystack() {
        return image;
    }

}
