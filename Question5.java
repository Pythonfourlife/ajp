import java.awt.*;

public class Question5 extends Frame {
    private MenuItem openItem;

    public Question5() {
        setTitle("Disable Menu Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // Create File menu
        Menu fileMenu = new Menu("File");

        // Create menu items for File menu
        openItem = new MenuItem("Open");

        // Add items to the File menu
        fileMenu.add(openItem);

        // Disable the "Open" menu item initially
        openItem.setEnabled(false);

        // Add the File menu to the MenuBar
        menuBar.add(fileMenu);

        // Set the MenuBar for the frame
        setMenuBar(menuBar);

        setVisible(true);

        // Set up a WindowListener to handle window closing
    }

    public static void main(String[] args) {
        new Question5();
    }
}
