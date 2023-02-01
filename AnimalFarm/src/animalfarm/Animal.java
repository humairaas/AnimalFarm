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

    static int total_animal_count = 0;
    int animal_index = 0;

    // Animal-specific parameters to be defined in the subclasses
    int cost;
    int sellPrice;
    int initialHungerLevel;
    int harvestingAgeInMinutes;
    
    int currentHungerLevel;
    int currentAgeInMinutes;
    int x;
    int y;
    boolean hasNotifiedReadyToHarvest = false;

    CurrencySingleton currencySingleton;
    
    public Animal() {
        currencySingleton = CurrencySingleton.getInstance();
    }

    public boolean canBeBought() {
        return currencySingleton.getCurrencyInstance() >= cost;
    }

    public boolean canBeSold() {
        return currentAgeInMinutes >= harvestingAgeInMinutes;
    }

    public void buy() {
        if (canBeBought()) {
            currencySingleton.setCurrency(currencySingleton.getCurrencyInstance() - cost);
        } else {
            System.out.println("Not enough money to buy this animal");
        }
    }

    public void sell() {
        currencySingleton.setCurrency(currencySingleton.getCurrencyInstance() + sellPrice);
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

        currentHungerLevel = initialHungerLevel;
        currentAgeInMinutes = 0;

        animal_index = total_animal_count;
        total_animal_count++;
        int intervalInSeconds = 60;
        timer = new Timer(intervalInSeconds * 1000, new ActionListener() {
            // Lapses every 60 seconds or 1 minute
            @Override
            public void actionPerformed(ActionEvent e) {
                currentAgeInMinutes++;
                currentHungerLevel--;
                System.out.println("Animal " + name + " of index " + animal_index + " hunger level: " + currentHungerLevel);
                if (currentHungerLevel <= 0) {
                    System.out.println("Animal " + name + " of index " + animal_index + " died of hunger");
                    stopTimer();
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
