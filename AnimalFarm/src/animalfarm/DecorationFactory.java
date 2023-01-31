/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfarm;

/**
 *
 * @author haneyiskdr
 */
public class DecorationFactory {

    public Decoration createDecoration(ElementEnum decorationType) {
        if (decorationType == null) {
            return null;
        }
        if (decorationType == ElementEnum.BARN) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 50);
            return new Barn();
        } else if (decorationType == ElementEnum.BUSH) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 5);
            return new Bush();
        } else if (decorationType == ElementEnum.COOP) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 10);
            return new Coop();
        } else if (decorationType == ElementEnum.DELETE) {
            return new Delete();
        } else if (decorationType == ElementEnum.FENCE) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 2);
            return new Fence();
        } else if (decorationType == ElementEnum.HAYSTACK) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 2);
            return new Haystack();
        } else if (decorationType == ElementEnum.LIGHT) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 25);
            return new Light();
        } else if (decorationType == ElementEnum.POND) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 50);
            return new Pond();
        } else if (decorationType == ElementEnum.TREE) {
            Farm.setCurrency(Farm.getCurrencyInstance() - 25);
            return new Tree();
        }
        return null;
    }
}
