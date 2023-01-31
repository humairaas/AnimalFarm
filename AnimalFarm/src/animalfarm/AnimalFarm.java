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
        barn = dfactory.createDecoration(ElementEnum.BARN, true);
        bush = dfactory.createDecoration(ElementEnum.BUSH, true);
        coop = dfactory.createDecoration(ElementEnum.COOP, true);
        haystack = dfactory.createDecoration(ElementEnum.HAYSTACK, true);
        light = dfactory.createDecoration(ElementEnum.LIGHT, true);
        pond = dfactory.createDecoration(ElementEnum.POND, true);
        tree = dfactory.createDecoration(ElementEnum.TREE, true);

        chicken = afactory.createAnimal(ElementEnum.CHICKEN, true);
        cow = afactory.createAnimal(ElementEnum.COW, true);
        duck = afactory.createAnimal(ElementEnum.DUCK, true);
        horse = afactory.createAnimal(ElementEnum.HORSE, true);
        sheep = afactory.createAnimal(ElementEnum.SHEEP, true);
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
