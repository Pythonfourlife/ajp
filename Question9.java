import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Question9 extends Frame {

    public Question9() {
        setTitle("WindowAdapter Example");
        setSize(300, 200);

        // Create a WindowAdapter and override the windowClosing method
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
                dispose(); // Release resources when closing the window
                System.exit(0); // Terminate the application
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Question9();
    }
}
