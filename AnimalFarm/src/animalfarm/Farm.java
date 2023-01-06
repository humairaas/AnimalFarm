package animalfarm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Farm extends JPanel implements ActionListener {

    int x = 8;
    int y = 12;
    int counter = 0;
    private final int height = 17;
    private final int width = 25;

    Element[][] farm = new Element[height][width];

    private final Icon el;
    Barn barnEl;
    Coop coopEl;
    Fence fenceEl;
    Haystack haystackEl;
    Light lightsEl;
    Pond pondEl;
    Bush bushEl;
    Tree treeEl;
    Delete deleteEl;
    private ImageIcon fenceImage;
    private final int size = 40;

    private boolean isCloudy = false;
    private boolean isWindy = false;
    private boolean isRainy = false;
    private boolean isNight = false;
    private boolean isBarn = false;
    private boolean isCoop = false;
    private boolean isFence = false;
    private boolean isHaystack = false;
    private boolean isLights = false;
    private boolean isPond = false;
    private boolean isBush = false;
    private boolean isTree = false;
    private boolean isDelete = false;

    public Farm(Barn barnEl, Coop coopEl, Fence fenceEl, Haystack haystackEl, Light lightsEl, Pond pondEl, Bush bushEl, Tree treeEl, Delete deleteEl) {
        el = new Icon();
        this.barnEl = barnEl;
        this.coopEl = coopEl;
        this.fenceEl = fenceEl;
        this.haystackEl = haystackEl;
        this.lightsEl = lightsEl;
        this.pondEl = pondEl;
        this.bushEl = bushEl;
        this.treeEl = treeEl;
        this.deleteEl = deleteEl;
    }
    
//    public Farm() {
//        el = new Icon();
//        barnEl = new Barn();
//        coopEl = new Coop();
//        fenceEl = new Fence();
//        haystackEl = new Haystack();
//        lightsEl = new Light();
//        pondEl = new Pond();
//        bushEl = new Bush();
//        treeEl = new Tree();
//        deleteEl = new Delete();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Draw initial farm
        el.getGrass().paintIcon(this, g, 0, 0);

        //Draw elements
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (farm[row][col] != null) {
                    draw(farm[row][col], g, row, col);
                }
            }
        }

        //Cloudy
        if (isCloudy) {
            el.getCloudy().paintIcon(this, g, 0, 0);
        }

        //Windy
        if (isWindy) {
        }

        //Rainy
        if (isRainy) {
            el.getDark().paintIcon(this, g, 0, 0);
            el.getRain().paintIcon(this, g, 0, 0);
        }

        //Night
        if (isNight) {
            el.getNight().paintIcon(this, g, 0, 0);
        }

        if (isBarn) {
            draw(barnEl, g, x, y);
        }

        if (isCoop) {
            draw(coopEl, g, x, y);
        }

        if (isFence) {
            fenceImage = fenceEl.getFence(counter);
            draw(fenceEl, g, x, y);
        }

        if (isHaystack) {
            draw(haystackEl, g, x, y);
        }

        if (isLights) {
            draw(lightsEl, g, x, y);
        }

        if (isPond) {
            draw(pondEl, g, x, y);
        }

        if (isBush) {
            draw(bushEl, g, x, y);
        }

        if (isTree) {
            draw(treeEl, g, x, y);
        }

        if (isDelete) {
            deleteEl.getDelete().paintIcon(this, g, y * size, x * size);
        }

        //Menu
        el.getMenu().paintIcon(this, g, 21 * size, 0);
    }
    
    public void draw(Element element, Graphics g, int row, int col){
        element.getImage().paintIcon(this, g, col * size , row * size - (element.getImage().getIconHeight() - size));
    }

    public void setIsRainy(boolean isRainy) {
        this.isRainy = isRainy;
    }

    public void setIsCloudy(boolean isCloudy) {
        this.isCloudy = isCloudy;
    }

    public void setIsWindy(boolean isWindy) {
        this.isWindy = isWindy;
    }

    public void setIsNight(boolean isNight) {
        this.isNight = isNight;
    }

    public void setIsBarn(boolean isBarn) {
        this.isBarn = isBarn;
    }

    public void setIsCoop(boolean isCoop) {
        this.isCoop = isCoop;
    }

    public void setIsFence(boolean isFence) {
        this.isFence = isFence;
    }

    public void setIsHaystack(boolean isHaystack) {
        this.isHaystack = isHaystack;
    }

    public void setIsLights(boolean isLights) {
        this.isLights = isLights;
    }

    public void setIsPond(boolean isPond) {
        this.isPond = isPond;
    }

    public void setIsBush(boolean isBush) {
        this.isBush = isBush;
    }

    public void setIsTree(boolean isTree) {
        this.isTree = isTree;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ImageIcon getFenceImage() {
        return fenceImage;
    }

    public void setElement(Decoration decoration, int x, int y) {
        this.farm[x][y] = decoration;
    }

    public void setElement(Animal animal, int x, int y) {
        this.farm[x][y] = animal;
    }

    public void setElement(Food food, int x, int y) {
        this.farm[x][y] = food;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void showFarm() {
        for (int row = 0; row < farm.length; row++) {
            System.out.println("");
            for (int col = 0; col < farm[row].length; col++) {
                System.out.print("[" + farm[row][col] + "]");
            }
        }
    }

    public void move(int moveX, int moveY) {
        x += moveX;
        y += moveY;
    }
    
}
