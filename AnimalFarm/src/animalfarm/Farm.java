package animalfarm;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Farm extends JPanel implements ActionListener {
    final int height = 17;
    final int width = 25;
    
    Element [][] farm = new Element[height][width];
    
    private Icon el;
    private final int size = 40;
    
    private boolean isCloudy = false;
    private boolean isWindy = false;
    private boolean isRainy = false;
    private boolean isNight = false;

    public Farm() {
        el = new Icon();
    }

    public void start() {
        GUIFacade gui = new AWTGUIFacade();
        gui.createWindow("Animal Farm", this);
    }

    public void stop() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Draw initial farm
        el.getGrass().paintIcon(this, g, 0, 0);

        //Draw elements
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (farm[row][col] != null) {
                    farm[row][col].getImage().paintIcon(this, g, col * size, row * size);
                }
            }
        }
        
        //Cloudy
        if(isCloudy){
            el.getCloudy().paintIcon(this, g, 0, 0);
        }
        
        //Windy
        if(isWindy){
        }
        
        //Rainy
        if(isRainy){
            el.getDark().paintIcon(this, g, 0, 0);
            el.getRain().paintIcon(this, g, 0, 0);
        }
        
        //Night
        if(isNight){
            el.getNight().paintIcon(this, g, 0, 0);
        }
    }

    public void setIsRainy(boolean isRainy) {
        this.isRainy = isRainy;
    }

    public void setIsCloudy(boolean isCloudy) {
        this.isCloudy = isCloudy;
    }

    public void setIsWindy(boolean isWindy) {
        this.isWindy = isWindy;
    }

    public void setIsNight(boolean isNight) {
        this.isNight = isNight;
    }

    public void setElement(Decorator decorator, int x, int y) {
        this.farm[x][y] = decorator;
    }
    
    public void setElement(Animal animal, int x, int y) {
        this.farm[x][y] = animal;
    }
    
    public void setElement(Food food, int x, int y) {
        this.farm[x][y] = food;
    }

    public void showFarm() {
        for (int row = 0; row < farm.length; row++) {
            System.out.println("");
            for (int col = 0; col < farm[row].length; col++) {
                System.out.print("[" + farm[row][col] + "]");
            }
        }
    }
}
