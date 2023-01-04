package animalfarm;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Element {
    private Image grass, cloudy, night, cow;
    private ImageIcon rain, tree;

    public Element() {
        //Grass
        grass = new ImageIcon("res/grass.png").getImage();
        
        //Night
        night = new ImageIcon("res/night.png").getImage();
        
        //Cloudy
        cloudy = new ImageIcon("res/cloudy.png").getImage();
        
        //Rain
        rain = new ImageIcon("res/rain.gif");
        
        //Tree
        tree = new ImageIcon("res/wind_tree.gif");
        
        //Cow
        cow = new ImageIcon("res/cow.png").getImage();
        
    }

    public Image getGrass() {
        return grass;
    }

    public ImageIcon getRain() {
        return rain;
    }

    public ImageIcon getTree() {
        return tree;
    }

    public Image getCloudy() {
        return cloudy;
    }

    public Image getNight() {
        return night;
    }

    public Image getCow() {
        return cow;
    }
    
    
}
