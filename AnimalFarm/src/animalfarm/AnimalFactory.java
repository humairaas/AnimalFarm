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
            Farm.setCurrency(Farm.getCurrencyInstance() - 1);
            return new Chicken();
        } else if (animalType == ElementEnum.COW) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 5);
            return new Cow();
        } else if (animalType == ElementEnum.DUCK) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 3);
            return new Duck();
        } else if (animalType == ElementEnum.HORSE) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 10);
            return new Horse();
        } else if (animalType == ElementEnum.SHEEP) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 8);
            return new Sheep();
        } 
        return null;
    }
}
