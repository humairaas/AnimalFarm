package animalfarm;

/**
 *
 * @author User
 */
public abstract class Decorator {
    String name;
    String image;

    public Decorator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
