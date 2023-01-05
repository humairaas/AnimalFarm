package animalfarm;


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
        Decorator tree = new Tree("Tree");
        Animal cow = new Cow("Cow");

        farm.setElement(tree.getImage(), 0, 0);
        farm.setElement(tree.getImage(), 1, 4);
        farm.setElement(tree.getImage(), 1, 5);
        farm.setElement(tree.getImage(), 3, 6);
        farm.setElement(tree.getImage(), 8, 6);
        farm.setElement(tree.getImage(), 6, 9);
        farm.setElement(tree.getImage(), 11, 5);
        farm.setElement(tree.getImage(), 11, 15);
        farm.setElement(cow.getImage(), 4, 10);

        
        farm.start();
        farm.showFarm();
    }
    
}
