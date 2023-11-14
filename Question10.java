import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question10 extends JFrame {
    private JTextArea textArea;

    public Question10() {
        setTitle("Key Status Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);

        add(textArea);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Key typed event
                showKeyStatus("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Key pressed event
                showKeyStatus("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Key released event
                showKeyStatus("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        setFocusable(true); // Make sure the frame can receive keyboard input

        setVisible(true);
    }

    private void showKeyStatus(String status) {
        textArea.append(status + "\n");
    }

    public static void main(String[] args) {
        new Question10();
    }
}
