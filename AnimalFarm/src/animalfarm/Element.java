package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public interface Element {

    ElementEnum getName();

    void setName(ElementEnum name);

    ImageIcon getImage();

    void setImage(ImageIcon icon);
}
