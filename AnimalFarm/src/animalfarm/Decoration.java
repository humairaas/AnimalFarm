package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public abstract class Decoration implements Element {

    String name;
    ImageIcon image;

    public Decoration() {
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
