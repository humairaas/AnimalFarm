/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfarm;

import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class LightOffCommand implements Command {
    Decoration light;

    public LightOffCommand(Decoration light) {
        this.light = light;
    }    
    
    @Override
    public void execute() {
        light.setImage(new ImageIcon("res/lamp_sun.png"));
    }
}
