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
    
    private Tree tree;
    private Bush bush;
    private Light light;

    public DecorationFactory(Tree tree, Bush bush, Light light) {
        this.tree = tree;
        this.bush = bush;
        this.light = light;
    }

    public Decoration createDecoration(ElementEnum decorationType, boolean isStart) {
        if (decorationType == null) {
            return null;
        }
        if (decorationType == ElementEnum.BARN) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 50) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 50);
            }
            return new Barn();
        } else if (decorationType == ElementEnum.BUSH) {
            // add as observer
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 5) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 5);
            }
            return new BushChild(bush);
        } else if (decorationType == ElementEnum.COOP) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 10) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 10);
            }
            return new Coop();
        } else if (decorationType == ElementEnum.DELETE) {
            return new Delete();
        } else if (decorationType == ElementEnum.FENCE) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 2) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 2);
            }
            return new Fence();
        } else if (decorationType == ElementEnum.HAYSTACK) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 2) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 2);
            }
            return new Haystack();
        } else if (decorationType == ElementEnum.LIGHT) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 25) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 25);
            }
            return new LightChild(light);
        } else if (decorationType == ElementEnum.POND) {
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 40) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 40);
            }
            return new Pond();
        } else if (decorationType == ElementEnum.TREE) {
            
            if (!isStart) {
                if (Farm.getCurrencyInstance() < 20) return null;
                Farm.setCurrency(Farm.getCurrencyInstance() - 20);
            }
            return new TreeChild(tree);
        }
        return null;
    }
}
