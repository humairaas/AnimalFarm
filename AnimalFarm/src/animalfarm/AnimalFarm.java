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
        barn = dfactory.createDecoration(ElementEnum.BARN);
        bush = dfactory.createDecoration(ElementEnum.BUSH);
        coop = dfactory.createDecoration(ElementEnum.COOP);
        haystack = dfactory.createDecoration(ElementEnum.HAYSTACK);
        light = dfactory.createDecoration(ElementEnum.LIGHT);
        pond = dfactory.createDecoration(ElementEnum.POND);
        tree = dfactory.createDecoration(ElementEnum.TREE);

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
