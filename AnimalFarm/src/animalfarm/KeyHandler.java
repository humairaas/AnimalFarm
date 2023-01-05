 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfarm;

import java.awt.event.*;

/**
 *
 * @author haneyiskdr
 */
public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    WeatherFacade weather;
    Farm farm;

    public KeyHandler(Farm farm, WeatherFacade weather) {
        this.farm = farm;
        this.weather = weather;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_DOWN) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
        
        // Control weather
        if (code == KeyEvent.VK_Q) {
            weather.Sunny();
            System.out.println("Pressed Sunny");
        }
        if (code == KeyEvent.VK_W) {
            weather.Windy();
            System.out.println("Pressed Windy");
        }
        if (code == KeyEvent.VK_E) {
            weather.Cloudy();
            System.out.println("Pressed Cloudy");
        }
        if (code == KeyEvent.VK_R) {
            weather.Rainy();
            System.out.println("Pressed Rainy");
        }
        if (code == KeyEvent.VK_T) {
            weather.Night();
            System.out.println("Pressed Night");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP) {
            upPressed = false;
        }
        if (code == KeyEvent.VK_DOWN) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
    }
}
