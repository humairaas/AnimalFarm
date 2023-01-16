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
            return new Barn();
        } else if (decorationType == ElementEnum.BUSH) {
            return new Bush();
        } else if (decorationType == ElementEnum.COOP) {
            return new Coop();
        } else if (decorationType == ElementEnum.DELETE) {
            return new Delete();
        } else if (decorationType == ElementEnum.FENCE) {
            return new Fence();
        } else if (decorationType == ElementEnum.HAYSTACK) {
            return new Haystack();
        } else if (decorationType == ElementEnum.LIGHT) {
            return new Light();
        } else if (decorationType == ElementEnum.POND) {
            return new Pond();
        } else if (decorationType == ElementEnum.TREE) {
            return new Tree();
        }
        return null;
    }
}
