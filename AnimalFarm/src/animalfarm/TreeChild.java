package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class TreeChild extends Decoration implements Observer{
    private Subject tree;

    public TreeChild(Subject tree) {
        name = ElementEnum.TREE;
        image = new ImageIcon("res/tree.png");
        this.tree = tree;
        tree.registerObserver(this);
    }
    
    @Override
    public void update(ImageIcon image) {
        this.image = image;
    }
 
}