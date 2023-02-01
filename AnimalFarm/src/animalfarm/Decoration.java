package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public abstract class Decoration implements Element {

    ElementEnum name;
    ImageIcon image;
    int cost;

    public Decoration() {
    }

    public void buy() {
        if (Farm.getCurrencyInstance() >= cost) {
            Farm.setCurrency(Farm.getCurrencyInstance() - cost);
        } else {
            System.out.println("Not enough money to buy this decoration");
        }
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
