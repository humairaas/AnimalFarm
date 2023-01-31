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
    public Animal createAnimal(ElementEnum animalType, boolean isStart) {

        if (animalType == null) {
            return null;
        }
        if (animalType == ElementEnum.CHICKEN) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 2) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 2);
            }
            return new Chicken();
        } else if (animalType == ElementEnum.COW) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 20) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 20);
            }
            return new Cow();
        } else if (animalType == ElementEnum.DUCK) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 5) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 5);
            }
            return new Duck();
        } else if (animalType == ElementEnum.HORSE) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 40) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 40);
            }
            return new Horse();
        } else if (animalType == ElementEnum.SHEEP) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 10) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 10);
            }
            return new Sheep();
        } 
        return null;
    }
}
