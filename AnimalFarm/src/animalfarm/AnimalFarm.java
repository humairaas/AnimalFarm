package animalfarm;

/**
 *
 * @author User
 */
public class AnimalFarm {

    static Farm farm;
    static AnimalFactory afactory;
    static DecorationFactory dfactory;
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

        chicken = afactory.createAnimal(ElementEnum.CHICKEN);
        cow = afactory.createAnimal(ElementEnum.COW);
        duck = afactory.createAnimal(ElementEnum.DUCK);
        horse = afactory.createAnimal(ElementEnum.HORSE);
        sheep = afactory.createAnimal(ElementEnum.SHEEP);
        farm = new Farm(barn, bush, coop, haystack, light, pond, tree, chicken, cow, duck, horse, sheep); 
        
        weather = new WeatherFacade(farm, tree, light, bush);
    }

    public void start() {
        AWTWindow window = new AWTWindow();
        window.init("Animal Farm");
        window.add(farm);
        window.addKeyListener(new KeyHandler(afactory, dfactory, farm, weather));
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        farm.showFarm();
        weather.Rainy();
    }

    public static Farm getFarmInstance() {
        return farm;
    }
    
}
