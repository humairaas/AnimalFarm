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
public class LightOnCommand implements Command {
    Decoration light;

    public LightOnCommand(Decoration light) {
        this.light = light;
    }    
    
    @Override
    public void execute() {
        light.setImage(new ImageIcon("res/lamp_night.png"));
    }
}
