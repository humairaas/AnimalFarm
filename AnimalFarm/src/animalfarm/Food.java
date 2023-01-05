package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public abstract class Food {
    String name;
    ImageIcon image;

    public Food() {
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
