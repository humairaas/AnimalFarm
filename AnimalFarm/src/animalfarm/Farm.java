package animalfarm;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Farm extends JPanel implements ActionListener {

    String weatherMode;
    String[][] farm = new String[17][25];
    private Element el;
    private final int size = 40;
    private JButton button;

    public Farm() {
        this.weatherMode = "Sunny";
        button = new JButton("Refresh");
        setLayout(new BorderLayout());
        add(button, BorderLayout.SOUTH);
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
        g.drawImage(el.getGrass(), 0, 0, null);

        //Windy tree
        for (int row = 0; row < farm.length; row++) {
            for (int col = 0; col < farm[row].length; col++) {
                if (farm[row][col] != null && farm[row][col].equals("tree")) {
                    el.getTree().paintIcon(this, g, col * size, row * size);
                }
                if (farm[row][col] != null && farm[row][col].equals("cow")) {
                    g.drawImage(el.getCow(), col * size, row * size, null);
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

    public String[][] getFarm() {
        return farm;
    }

    public void showFarm() {
        System.out.println("Weather Mode: " + weatherMode);
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
