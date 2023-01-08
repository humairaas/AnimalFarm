package animalfarm;

/**
 *
 * @author User
 */
public class AnimalFarm {

    Farm farm;
    Barn barn;
    Coop coop; 
    Fence fence; 
    Haystack haystack; 
    Light light; 
    Pond pond;
    Bush bush; 
    Tree tree;
    Delete hammer;
    Cow cow;                                
    Sheep sheep;                            
    Duck duck;                              
    Chicken chicken;                        
    Horse horse;                            
    WeatherFacade weather;

    public AnimalFarm() {
        barn = new Barn();
        coop = new Coop();
        fence = new Fence();
        haystack = new Haystack();
        light = new Light();
        pond = new Pond();
        bush = new Bush();
        tree= new Tree();
        hammer = new Delete();
        cow = new Cow();                            
        sheep = new Sheep();                        
        duck = new Duck();                          
        chicken = new Chicken();                    
        horse = new Horse();                        
        farm = new Farm(barn, coop, fence, haystack, light, pond, bush, tree, hammer, cow, sheep, duck, chicken, horse); 
        
        weather = new WeatherFacade(farm, tree, light, bush);
    }

    public void start() {
        AWTWindow window = new AWTWindow();
        window.init("Animal Farm");
        window.add(farm);
        window.addKeyListener(new KeyHandler(farm, weather));
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        farm.showFarm();
        weather.Rainy();
    }
    
}
