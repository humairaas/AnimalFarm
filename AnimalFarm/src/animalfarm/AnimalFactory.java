/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfarm;

/**
 *
 * @author haneyiskdr
 */
public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("CHICKEN")) {
            return new Chicken();
        } else if (animalType.equalsIgnoreCase("COW")) {
            return new Cow();
        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        } else if (animalType.equalsIgnoreCase("HORSE")) {
            return new Horse();
        } else if (animalType.equalsIgnoreCase("SHEEP")) {
            return new Sheep();
        } 
        return null;
    }
}
