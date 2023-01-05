package animalfarm;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public abstract class Animal {
    String name;
    ImageIcon image;
    String audio;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

}
