package animalfarm;

/**
 *
 * @author User
 */
public class AnimalFarm {

    Farm farm;
    AnimalFactory afactory;
    DecorationFactory dfactory;
    Decoration barn, bush, coop, delete, fence, haystack, light, pond, tree; 
    Animal chicken, cow, duck, horse, sheep;                  
    WeatherFacade weather;

    public AnimalFarm() {
        afactory = new AnimalFactory();
        dfactory = new DecorationFactory();
        barn = dfactory.createDecoration("barn");
        bush = dfactory.createDecoration("bush");
        coop = dfactory.createDecoration("coop");
        haystack = dfactory.createDecoration("haystack");
        light = dfactory.createDecoration("light");
        pond = dfactory.createDecoration("pond");
        tree = dfactory.createDecoration("tree");
        chicken = afactory.createAnimal("chicken");
        cow = afactory.createAnimal("cow");
        duck = afactory.createAnimal("duck");
        horse = afactory.createAnimal("horse");
        sheep = afactory.createAnimal("sheep");
        farm = new Farm(barn, bush, coop, haystack, light, pond, tree, chicken, cow, duck, horse, sheep); 
        
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
