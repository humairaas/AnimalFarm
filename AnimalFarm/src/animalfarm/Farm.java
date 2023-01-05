package animalfarm;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Farm extends JLabel implements ActionListener {

    String weatherMode;
    String[][] farm = new String[17][25];
    private Element el;
    private final int size = 40;

    public Farm() {
        this.weatherMode = "Sunny";
        el = new Element();
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
        for (int row = 0; row < farm.length; row++) {
            for (int col = 0; col < farm[row].length; col++) {
                el.getGrass().paintIcon(this, g, col*size, row*size);
            }
        }

        //Windy tree
        for (int row = 0; row < farm.length; row++) {
            for (int col = 0; col < farm[row].length; col++) {
                if (farm[row][col] != null && farm[row][col].equals("tree")) {
                    el.getTree().paintIcon(this, g, col*size, row*size);
                }
                if (farm[row][col] != null && farm[row][col].equals("cow")) {
                    el.getCow().paintIcon(this, g, col*size, row*size);
                }
            }
        }

//            //Cloudy
//            g.drawImage(el.getCloudy(), 0, 0, null);
//            //Rain
//            for(int row=0; row<farm.length; row++){
//                for (int col=0; col<farm[row].length; col++){
//                    el.getRain().paintIcon(this, g, col*size*3, row*size*3);
//                }
//            }
//            //Night
//            g.drawImage(el.getNight(), 0, 0, null);
    }
    
    public void paintRainy(Graphics g){
        super.paint(g);
        
        el.getDark().paintIcon(this, g, 0, 0);
        el.getRain().paintIcon(this, g, 0, 0);
    }

    public String[][] getFarm() {
        return farm;
    }

    public void showFarm() {
        for (int row = 0; row < farm.length; row++) {
            System.out.println("");
            for (int col = 0; col < farm[row].length; col++) {
                System.out.print("[" + farm[row][col] + "]");
            }
        }
    }

    public void setElement(String element, int x, int y) {
        farm[x][y] = element;
    }

    public void setWeatherMode(String weatherMode) {
        WeatherFacade weather = new WeatherFacade(this, weatherMode);
        weather.start();
    }
}
