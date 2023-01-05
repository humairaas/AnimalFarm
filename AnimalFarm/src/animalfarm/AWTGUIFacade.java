package animalfarm;

public class AWTGUIFacade implements GUIFacade {
    @Override
    public void createWindow(String title, Farm farm) {
        AWTWindow window = new AWTWindow();
        window.init(title);
        window.add(farm);
//        window.addKeyListener(new KeyHandler(farm));
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
