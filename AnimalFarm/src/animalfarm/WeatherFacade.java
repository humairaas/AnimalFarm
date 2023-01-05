package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class WeatherFacade {
    Farm farm;
    Decorator tree;
    Audio audio;

    public WeatherFacade(Farm farm, Decorator tree) {
        this.farm = farm;
        this.tree = tree;
        audio = new Audio();
    }
    
    public void Sunny(){
        farm.setIsCloudy(false);
        farm.setIsRainy(false);
        farm.setIsWindy(false);
        farm.setIsNight(false);
        
        tree.setImage(new ImageIcon("res/tree.png"));
        
        audio.stopRain();
        audio.stopNight();
        audio.stopWind();
    }
    
    public void Cloudy(){
        farm.setIsCloudy(true);
        farm.setIsRainy(false);
        farm.setIsWindy(false);
        farm.setIsNight(false);
        
        tree.setImage(new ImageIcon("res/tree.png"));
        
        audio.stopRain();
        audio.stopNight();
        audio.stopWind();
    }
    
    public void Windy(){
        farm.setIsCloudy(false);
        farm.setIsRainy(false);
        farm.setIsWindy(true);
        farm.setIsNight(false);
        
        tree.setImage(new ImageIcon("res/wind_tree.gif"));
        
        audio.stopRain();
        audio.stopNight();
        audio.playWind();
    }
    
    public void Rainy(){
        farm.setIsCloudy(false);
        farm.setIsRainy(true);
        farm.setIsWindy(false);
        farm.setIsNight(false);
        
        tree.setImage(new ImageIcon("res/wind_tree.gif"));
        
        audio.stopWind();
        audio.stopNight();
        audio.playRain();
    }
    
    public void Night(){
        farm.setIsCloudy(false);
        farm.setIsRainy(false);
        farm.setIsWindy(false);
        farm.setIsNight(true);
        
        tree.setImage(new ImageIcon("res/tree.png"));
        
        audio.stopWind();
        audio.stopRain();
        audio.playNight();
    }
}
