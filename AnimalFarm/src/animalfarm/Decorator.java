package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public abstract class Decorator {
    String name;
    ImageIcon image;

    public Decorator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
