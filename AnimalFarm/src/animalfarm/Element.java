package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Element {
    private ImageIcon grass, cloudy, night, cow, rain, tree, sunny, dark, farm;

    public Element() {
        //Grass
        farm = new ImageIcon("res/Farm.png");
        
        //Grass
        grass = new ImageIcon("res/grass.png");
        
        //Night
        night = new ImageIcon("res/night.png");
        
        //Cloudy
        cloudy = new ImageIcon("res/cloudy1.png");
        
        //Sunny
        sunny = new ImageIcon("res/sunny.png");
        
        //Rain
        rain = new ImageIcon("res/rain5.gif");
        
        //Cloudy
        dark = new ImageIcon("res/cloudy.png");
        
        //Tree
        tree = new ImageIcon("res/wind_tree.gif");
        
        //Cow
        cow = new ImageIcon("res/cow.png");
        
    }

    public ImageIcon getGrass() {
        return grass;
    }

    public ImageIcon getRain() {
        return rain;
    }
    
    public ImageIcon getFarm() {
        return farm;
    }
    
    public ImageIcon getDark() {
        return dark;
    }

    public ImageIcon getTree() {
        return tree;
    }

    public ImageIcon getCloudy() {
        return cloudy;
    }
    
    public ImageIcon getSunny() {
        return sunny;
    }

    public ImageIcon getNight() {
        return night;
    }

    public ImageIcon getCow() {
        return cow;
    }
    
    
}
