import java.awt.*;
import java.awt.event.*;

public class Question4 extends Frame {
    private TextArea textArea;
    private MenuItem openItem;

    public Question4() {
        setTitle("Menu Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        textArea = new TextArea();
        add(textArea);

        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // Create File menu
        Menu fileMenu = new Menu("File");

        // Create menu items for File menu
        openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add items to the File menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Separator line
        fileMenu.add(exitItem);

        // Create Edit menu
        Menu editMenu = new Menu("Edit");

        // Create menu items for Edit menu
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add items to the Edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Create Help menu
        Menu helpMenu = new Menu("Help");

        // Create menu items for Help menu
        MenuItem aboutItem = new MenuItem("About");

        // Add items to the Help menu
        helpMenu.add(aboutItem);

        // Add the menus to the MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the MenuBar for the frame
        setMenuBar(menuBar);

        // Disable the "Open" menu item initially
        openItem.setEnabled(false);
        setVisible(true);

        // Set up a WindowListener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose(); // Release resources when closing the window
                System.exit(0); // Terminate the application
            }
        });
    }

    public static void main(String[] args) {
        new Question4();
    }
}
