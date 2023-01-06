package animalfarm;

/**
 *
 * @author User
 */
public class AnimalFarm {

    Farm farm;
    Decoration tree;
    WeatherFacade weather;

    public AnimalFarm() {
        farm = new Farm();
        tree = new Tree();
        weather = new WeatherFacade(farm, tree);
    }

    public void start() {
        AWTWindow window = new AWTWindow();
        window.init("Animal Farm");
        window.add(farm);
        window.addKeyListener(new KeyHandler(farm, weather));
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        farm.setElement(tree, 0, 0);
        farm.showFarm();
        weather.Rainy();
    }
    
}
