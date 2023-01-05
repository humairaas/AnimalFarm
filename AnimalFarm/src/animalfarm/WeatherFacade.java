package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class WeatherFacade {
    Farm farm;
    Decorator tree;

    public WeatherFacade(Farm farm, Decorator tree) {
        this.farm = farm;
        this.tree = tree;
    }
    
    public void Sunny(){
        farm.setIsCloudy(false);
        farm.setIsRainy(false);
        farm.setIsWindy(false);
        farm.setIsNight(false);
    }
    
    public void Cloudy(){
        farm.setIsCloudy(true);
    }
    
    public void Windy(){
        farm.setIsWindy(true);
    }
    
    public void Rainy(){
        farm.setIsRainy(true);
        tree.setImage(new ImageIcon("res/wind_tree.gif"));
    }
    
    public void Night(){
        farm.setIsNight(true);
    }
}
