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
    public Animal createAnimal(ElementEnum animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType == ElementEnum.CHICKEN) {
            return new Chicken();
        } else if (animalType == ElementEnum.COW) {
            return new Cow();
        } else if (animalType == ElementEnum.DUCK) {
            return new Duck();
        } else if (animalType == ElementEnum.HORSE) {
            return new Horse();
        } else if (animalType == ElementEnum.SHEEP) {
            return new Sheep();
        } 
        return null;
    }
}
