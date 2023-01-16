package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public abstract class Food implements Element {

    ElementEnum name;
    ImageIcon image;

    public Food() {
    }

    @Override
    public ElementEnum getName() {
        return name;
    }

    @Override
    public void setName(ElementEnum name) {
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
