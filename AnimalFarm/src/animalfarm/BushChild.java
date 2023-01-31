package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class BushChild extends Decoration implements Observer{
    private Subject bush;

    public BushChild(Subject bush) {
        name = ElementEnum.BUSH;
        image = new ImageIcon("res/bush.png");
        this.bush = bush;
        bush.registerObserver(this);
    }
    
    @Override
    public void update(ImageIcon image) {
        this.image = image;
    }
 
}
