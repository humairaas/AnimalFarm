package animalfarm;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Farm extends JPanel implements ActionListener {

    ImageIcon[][] farm = new ImageIcon[17][25];
    private Element el;
    private final int size = 40;
    
    boolean isRainy = false;

    public Farm() {
        el = new Element();
        addKeyListener(new KeyHandler());
        setFocusable(true);
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
        for (int row = 0; row < farm.length; row++) {
            for (int col = 0; col < farm[row].length; col++) {
                if (farm[row][col] != null) {
                    farm[row][col].paintIcon(this, g, col * size, row * size);
                }
            }
        }
        
        //Cloudy
        if(isRainy){
            el.getCloudy().paintIcon(this, g, 0, 0);
            el.getRain().paintIcon(this, g, 0, 0);
        }
        
        //Night
//        g.drawImage(el.getNight(), 0, 0, null);
    }
//
//    public String[][] getFarm() {
//        return farm;
//    }

    public void setIsRainy(boolean isRainy) {
        this.isRainy = isRainy;
    }

    public void showFarm() {
        for (int row = 0; row < farm.length; row++) {
            System.out.println("");
            for (int col = 0; col < farm[row].length; col++) {
                System.out.print("[" + farm[row][col] + "]");
            }
        }
    }

    public void setElement(Decorator decorator, int x, int y) {
        farm[x][y] = decorator.getImage();
    }
    
    public void setElement(Animal animal, int x, int y) {
        farm[x][y] = animal.getImage();
    }
    
    public void setElement(Food food, int x, int y) {
        farm[x][y] = food.getImage();
    }
}
