package animalfarm;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Icon {

    private ImageIcon grass, cloudy, night, rain, dark, barn, menu, cow, sheep, duck, chicken, horse; 

    public Icon() {
        //Grass
        grass = new ImageIcon("res/farm.png");

        //Menu
        menu = new ImageIcon("res/side_menu.png");

        //Night
        night = new ImageIcon("res/night.png");

        //Cloudy
        cloudy = new ImageIcon("res/cloudy.png");

        //Rain
        rain = new ImageIcon("res/rain.gif");

        //Dark
        dark = new ImageIcon("res/dark.png");

        //Dark
        barn = new ImageIcon("res/barn.png");
        
        //Cow
        cow = new ImageIcon("res/cow.png");             
        
        //Sheep
        sheep = new ImageIcon("res/sheep.png");         
        
        //duck
        duck = new ImageIcon("res/duck.png");           
        
        //Chicken
        chicken = new ImageIcon("res/chicken.png");       
                
        //horse
        horse = new ImageIcon("res/horse.png");         
        
        
    }
    

    public ImageIcon getGrass() {
        return grass;
    }

    public ImageIcon getMenu() {
        return menu;
    }

    public ImageIcon getBarn() {
        return barn;
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
    public ImageIcon getCow() {
        return cow;                              
    }
    public ImageIcon getSheep() {
        return sheep;                               
    }
    public ImageIcon getDuck() {
        return duck;                              
    }
    public ImageIcon getChicken() {
        return chicken;                                 
    }
    public ImageIcon getHorse() {
        return horse;                                
    }
}
