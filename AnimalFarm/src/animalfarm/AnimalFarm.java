package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class AnimalFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farm farm = new Farm(); 
        
        Decorator tree = new Tree();
        
        WeatherFacade weather = new WeatherFacade(farm, tree);

        farm.start();
        
        farm.setElement(tree, 0, 0);
        farm.setElement(tree, 1, 1);
        farm.setElement(tree, 2, 2);
        
        farm.showFarm();
        
        weather.Rainy();
    }
    
}
