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
    Timer timer;
    int initialHungerLevel = 10;
    int currentHungerLevel = initialHungerLevel;
    static int total_animal_count = 0;
    int animal_index = 0;
    int x;
    int y;
    int cost;
    int sellPrice;
    int currentAgeInMinutes = 0;
    int harvestingAgeInMinutes = 1;
    int interval_in_seconds = 60;
    boolean hasNotifiedReadyToHarvest = false;
    
    public Animal() {
    }

    public boolean canBeBought() {
        return Farm.getCurrencyInstance() >= cost;
    }

    public boolean canBeSold() {
        return currentAgeInMinutes >= harvestingAgeInMinutes;
    }

    public void buy() {
        if (canBeBought()) {
            Farm.setCurrency(Farm.getCurrencyInstance() - cost);
        } else {
            System.out.println("Not enough money to buy this animal");
        }
    }

    public void sell() {
        Farm.setCurrency(Farm.getCurrencyInstance() + sellPrice);
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

    public void stopTimer() {
        timer.stop();
    }

    public void delete() {
        AnimalFarm.getFarmInstance().deleteElement(x, y);
    }

    public void feed() {
        currentHungerLevel = initialHungerLevel;
    }

    public void add(int x, int y) {
        this.x = x;
        this.y = y;

        animal_index = total_animal_count;
        total_animal_count++;
        timer = new Timer(interval_in_seconds * 1000 / 4, new ActionListener() {
            // Lapses every 60 seconds or 1 minute
            @Override
            public void actionPerformed(ActionEvent e) {
                currentAgeInMinutes++;
                currentHungerLevel--;
                System.out.println("Animal " + name + " of index " + animal_index + " hunger level: " + currentHungerLevel);
                if (currentHungerLevel <= 0) {
                    System.out.println("Animal " + name + " of index " + animal_index + " died of hunger");
                    delete();
                }
                System.out.println("Animal " + name + " of index " + animal_index + " is now aged " + currentAgeInMinutes + " years");
                if (canBeSold() && !hasNotifiedReadyToHarvest) {
                    hasNotifiedReadyToHarvest = true;
                    System.out.println("Animal " + name + " of index " + animal_index + " is ready to be sold");
                }
            }
        });

        timer.start();
    }

}
