package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public abstract class Decorator implements Element{
    String name;
    ImageIcon image;

    public Decorator() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ImageIcon getImage() {
        return image;
    }

    @Override
    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
