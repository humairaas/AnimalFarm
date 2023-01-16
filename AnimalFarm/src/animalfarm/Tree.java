package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Tree extends Decoration {

    public Tree() {
        name = ElementEnum.TREE;
        image = new ImageIcon("res/tree.png");
    }

    public ImageIcon getTree() {
        return image;
    }
    
}
