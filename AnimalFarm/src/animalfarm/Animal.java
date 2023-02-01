package animalfarm;

import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author User
 */
public abstract class Animal implements Element {

    ElementEnum name;
    ImageIcon image;
    String audio;
    int hunger_level = 30;
    static int total_animal_count = 0;
    int animal_index = 0;
    int x;
    int y;

    public Animal() {

    }

    @Override
    public ElementEnum getName() {
        return name;
    }

    @Override
    public void setName(ElementEnum name) {
        this.name = name;
    }

    @Override
    public ImageIcon getImage() {
        // right over here
        return image;
    }

    @Override
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void startTimer() {
        animal_index = total_animal_count;
        total_animal_count++;
        int interval_in_seconds = 60;
        Timer timer = new Timer(interval_in_seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hunger_level -= 5;
                System.out.println("Animal " + name + " " + animal_index + " hunger level: " + hunger_level);
                if (hunger_level <= 0) {
                    System.out.println("Animal " + name + " " + animal_index + " died of hunger (HOW DARE YOU?)");
                    AnimalFarm.getFarmInstance().deleteElement(x, y);
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

}
