package animalfarm;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class KeyHandler implements KeyListener {

    WeatherFacade weather;
    AnimalFactory afactory;
    DecorationFactory dfactory;
    Decoration decoration;
    ImageIcon image;
    Animal animal;
    Farm farm;

    int speedX, speedY;

    public KeyHandler(AnimalFactory afactory, DecorationFactory dfactory, Farm farm, WeatherFacade weather) {
        this.farm = farm;
        this.weather = weather;
        this.afactory = afactory;
        this.dfactory = dfactory;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        ElementEnum currentElementEnum = farm.getCurrentElementEnum();

        if (code == KeyEvent.VK_UP) {
            farm.move(-1, 0);
            speedX = -1;
            speedY = 0;
        }
        if (code == KeyEvent.VK_DOWN) {
            farm.move(1, 0);
            speedX = 1;
            speedY = 0;
        }
        if (code == KeyEvent.VK_LEFT) {
            farm.move(0, -1);
            speedX = 0;
            speedY = -1;
        }
        if (code == KeyEvent.VK_RIGHT) {
            farm.move(0, 1);
            speedX = 0;
            speedY = 1;
        }

        // Control decoration
        if (code == KeyEvent.VK_SPACE) {
            if (this.decoration != null) {
                if (this.decoration.name.equals(ElementEnum.FENCE)) {
                    this.decoration.setImage(farm.getFenceImage());
                } else if (this.decoration.name.equals(ElementEnum.DELETE)) {
                    this.decoration.setImage(new ImageIcon("res/empty.png"));
                }
            }
            if (this.decoration != null) {
                farm.setElement(dfactory.createDecoration(currentElementEnum, false), farm.x, farm.y);
            } else {
                farm.setElement(afactory.createAnimal(currentElementEnum, false), farm.x, farm.y);
            }
            System.out.println("Current currency is " + Farm.getCurrencyInstance());
            farm.setCurrentElementEnum(ElementEnum.EMPTY);
            farm.setAllFalse();
            farm.setX(8);
            farm.setY(12);
            farm.setCounter(0);
        }
        if (code == KeyEvent.VK_1) {
            farm.setCurrentElementEnum(ElementEnum.BARN);
            farm.setAllFalse();
            this.decoration = farm.barnEl;
            farm.setIsBarn(true);
        }
        if (code == KeyEvent.VK_2) {
            farm.setCurrentElementEnum(ElementEnum.COOP);
            farm.setAllFalse();
            this.decoration = farm.coopEl;
            farm.setIsCoop(true);
        }
        if (code == KeyEvent.VK_3) {
            farm.setCurrentElementEnum(ElementEnum.FENCE);
            farm.setAllFalse();
            if (farm.getCounter() == 8) {
                farm.setCounter(0);
            }
            int counter = farm.getCounter();
            counter++;
            this.decoration = farm.fenceEl;
            farm.setCounter(counter);
            farm.setIsFence(true);
        }
        if (code == KeyEvent.VK_4) {
            farm.setCurrentElementEnum(ElementEnum.HAYSTACK);
            farm.setAllFalse();
            this.decoration = farm.haystackEl;
            farm.setIsHaystack(true);
        }
        if (code == KeyEvent.VK_5) {
            farm.setCurrentElementEnum(ElementEnum.LIGHT);
            farm.setAllFalse();
            this.decoration = farm.lightsEl;
            farm.setIsLights(true);
        }
        if (code == KeyEvent.VK_6) {
            farm.setCurrentElementEnum(ElementEnum.POND);
            farm.setAllFalse();
            this.decoration = farm.pondEl;
            farm.setIsPond(true);
        }
        if (code == KeyEvent.VK_7) {
            farm.setCurrentElementEnum(ElementEnum.BUSH);
            farm.setAllFalse();
            this.decoration = farm.bushEl;
            farm.setIsBush(true);
        }
        if (code == KeyEvent.VK_8) {
            farm.setCurrentElementEnum(ElementEnum.TREE);
            farm.setAllFalse();
            this.decoration = farm.treeEl;
            farm.setIsTree(true);
        }
        if (code == KeyEvent.VK_9) {
            farm.setAllFalse();
            this.decoration = dfactory.createDecoration(ElementEnum.DELETE, false);
            farm.setIsDelete(true);
        }

        // Control animal
        if (code == KeyEvent.VK_A) {
            farm.setCurrentElementEnum(ElementEnum.COW);
            farm.setAllFalse();
            this.decoration = null;
            this.animal = farm.cowEl;
            farm.setIsCow(true);
        }

        if (code == KeyEvent.VK_S) {
            farm.setCurrentElementEnum(ElementEnum.SHEEP);
            farm.setAllFalse();
            this.decoration = null;
            this.animal = farm.sheepEl;
            farm.setIsSheep(true);
        }

        if (code == KeyEvent.VK_D) {
            farm.setCurrentElementEnum(ElementEnum.DUCK);
            farm.setAllFalse();
            this.decoration = null;
            this.animal = farm.duckEl;
            farm.setIsDuck(true);
        }

        if (code == KeyEvent.VK_F) {
            farm.setCurrentElementEnum(ElementEnum.CHICKEN);
            farm.setAllFalse();
            this.decoration = null;
            this.animal = farm.chickenEl;
            farm.setIsChicken(true);
        }

        if (code == KeyEvent.VK_G) {
            farm.setCurrentElementEnum(ElementEnum.HORSE);
            farm.setAllFalse();
            this.decoration = null;
            this.animal = farm.horseEl;
            farm.setIsHorse(true);
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

    }
}
