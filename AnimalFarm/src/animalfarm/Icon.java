package animalfarm;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Icon {
    private ImageIcon grass, cloudy, night, rain, dark;

    public Icon() {
        //Grass
        grass = new ImageIcon("res/farm.png");
        
        //Night
        night = new ImageIcon("res/night.png");
        
        //Cloudy
        cloudy = new ImageIcon("res/cloudy.png");
        
        //Rain
        rain = new ImageIcon("res/rain5.gif");
        
        //Dark
        dark = new ImageIcon("res/cloudy1.gif");
        
    }

    public ImageIcon getGrass() {
        return grass;
    }

    public ImageIcon getRain() {
        return rain;
    }

    public ImageIcon getCloudy() {
        return cloudy;
    }

    public ImageIcon getNight() {
        return night;
    }
    
    public ImageIcon getDark() {
        return dark;
    }
}
