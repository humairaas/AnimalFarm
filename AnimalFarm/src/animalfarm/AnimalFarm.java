package animalfarm;

import java.util.Scanner;


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
        Animal cow = new Cow();

        farm.start();
        
        farm.setElement(tree, 0, 0);
        farm.setElement(tree, 1, 1);
        farm.setElement(tree, 2, 2);
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Rain?");
        String ans = s.next();
        if(ans.equals("y")){
            farm.setIsRainy(true);
        }
    }
    
}
