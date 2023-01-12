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

    public Decoration createDecoration(String decorationType) {
        if (decorationType == null) {
            return null;
        }
        if (decorationType.equalsIgnoreCase("BARN")) {
            return new Barn();
        } else if (decorationType.equalsIgnoreCase("BUSH")) {
            return new Bush();
        } else if (decorationType.equalsIgnoreCase("COOP")) {
            return new Coop();
        } else if (decorationType.equalsIgnoreCase("DELETE")) {
            return new Delete();
        } else if (decorationType.equalsIgnoreCase("FENCE")) {
            return new Fence();
        } else if (decorationType.equalsIgnoreCase("HAYSTACK")) {
            return new Haystack();
        } else if (decorationType.equalsIgnoreCase("LIGHT")) {
            return new Light();
        } else if (decorationType.equalsIgnoreCase("POND")) {
            return new Pond();
        } else if (decorationType.equalsIgnoreCase("TREE")) {
            return new Tree();
        }
        return null;
    }
}
