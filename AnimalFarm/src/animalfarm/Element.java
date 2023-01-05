package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public interface Element {
    String getName();
    void setName(String name);
    ImageIcon getImage();
    void setImage(ImageIcon icon);
}
