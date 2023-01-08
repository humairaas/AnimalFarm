package animalfarm;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author haneyiskdr
 */
public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    WeatherFacade weather;
    Decoration decoration;
    ImageIcon image;
    Farm farm;

    int speedX, speedY;

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
            farm.move(-1, 0);
            speedX = -1;
            speedY = 0;
        }
        if (code == KeyEvent.VK_DOWN) {
            downPressed = true;
            farm.move(1, 0);
            speedX = 1;
            speedY = 0;
        }
        if (code == KeyEvent.VK_LEFT) {
            leftPressed = true;
            farm.move(0, -1);
            speedX = 0;
            speedY = -1;
        }
        if (code == KeyEvent.VK_RIGHT) {
            rightPressed = true;
            farm.move(0, 1);
            speedX = 0;
            speedY = 1;
        }

        // Set decoration place
        if (code == KeyEvent.VK_SPACE) {
            if (this.decoration.name.equals("fence")) {
                this.decoration.setImage(farm.getFenceImage());
            }
            if (this.decoration.name.equals("delete")) {
                this.decoration.setImage(new ImageIcon("res/empty.png"));
            }
            farm.setElement(decoration, farm.x, farm.y);
            farm.setIsBarn(false);
            farm.setIsCoop(false);
            farm.setIsFence(false);
            farm.setIsHaystack(false);
            farm.setIsLights(false);
            farm.setIsPond(false);
            farm.setIsBush(false);
            farm.setIsTree(false);
            farm.setIsDelete(false);
            farm.setX(8);
            farm.setY(12);
            farm.setCounter(0);
        }

        if (code == KeyEvent.VK_1) {
            this.decoration = new Barn();
            farm.setIsBarn(true);
        }
        if (code == KeyEvent.VK_2) {
            this.decoration = new Coop();
            farm.setIsCoop(true);
        }
        if (code == KeyEvent.VK_3) {
            if (farm.getCounter() == 8) {
                farm.setCounter(0);
            }
            int counter = farm.getCounter();
            counter++;
            farm.setCounter(counter);
            this.decoration = new Fence();
            farm.setIsFence(true);
        }
        if (code == KeyEvent.VK_4) {
            this.decoration = new Haystack();
            farm.setIsHaystack(true);
        }
        if (code == KeyEvent.VK_5) {
            this.decoration = farm.lightsEl;
            farm.setIsLights(true);
        }
        if (code == KeyEvent.VK_6) {
            this.decoration = new Pond();
            farm.setIsPond(true);
        }
        if (code == KeyEvent.VK_7) {
            this.decoration = farm.bushEl;
            farm.setIsBush(true);
        }
        if (code == KeyEvent.VK_8) {
            this.decoration = farm.treeEl;
            farm.setIsTree(true);
        }

        if (code == KeyEvent.VK_9) {
            this.decoration = new Delete();
            farm.setIsDelete(true);
        }

        // Control weather
        if (code == KeyEvent.VK_Q) {
            weather.Sunny();
            System.out.println("Q");
        }
        if (code == KeyEvent.VK_W) {
            weather.Windy();
            System.out.println("W");
        }
        if (code == KeyEvent.VK_E) {
            weather.Cloudy();
            System.out.println("E");
        }
        if (code == KeyEvent.VK_R) {
            weather.Rainy();
            System.out.println("R");
        }
        if (code == KeyEvent.VK_T) {
            weather.Night();
            System.out.println("T");
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
