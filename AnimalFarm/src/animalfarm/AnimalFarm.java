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
    Tree treeSubject;
    Bush bushSubject;
    Light lightSubject;
    Animal chicken, cow, duck, horse, sheep;                  
    WeatherFacade weather;

    public AnimalFarm() {
        treeSubject = new Tree();
        bushSubject = new Bush();
        lightSubject = new Light();
        
        afactory = new AnimalFactory();
        dfactory = new DecorationFactory(treeSubject, bushSubject, lightSubject);
        
        tree = dfactory.createDecoration(ElementEnum.TREE, true);
        bush = dfactory.createDecoration(ElementEnum.BUSH, true);
        light = dfactory.createDecoration(ElementEnum.LIGHT, true);
        
        barn = dfactory.createDecoration(ElementEnum.BARN, true);
        coop = dfactory.createDecoration(ElementEnum.COOP, true);
        haystack = dfactory.createDecoration(ElementEnum.HAYSTACK, true);
        pond = dfactory.createDecoration(ElementEnum.POND, true);

        chicken = afactory.createAnimal(ElementEnum.CHICKEN, true);
        cow = afactory.createAnimal(ElementEnum.COW, true);
        duck = afactory.createAnimal(ElementEnum.DUCK, true);
        horse = afactory.createAnimal(ElementEnum.HORSE, true);
        sheep = afactory.createAnimal(ElementEnum.SHEEP, true);
        farm = new Farm(barn, bush, coop, haystack, light, pond, tree, chicken, cow, duck, horse, sheep); 
        
        weather = new WeatherFacade(farm, treeSubject, lightSubject, bushSubject);
    }

    public void start() {
        AWTWindow window = new AWTWindow();
        window.init("Animal Farm");
        window.add(farm);
        window.addKeyListener(new KeyHandler(afactory, dfactory, farm, weather, lightSubject));
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
