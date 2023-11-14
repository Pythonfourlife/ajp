import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javax.swing.*;;

public class Question12 extends Frame {

    public Question12() {
        TextField usernameField = new TextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        setTitle("Login Screen");
        setSize(300, 150);

        usernameField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                showMessage("Username changed: " + usernameField.getText());
            }
        });

        loginButton.addActionListener(e -> showMessage("Login clicked"));

        setLayout(new GridLayout(3, 1));
        add(new Label("Username:"));
        add(usernameField);
        add(new Label("Password:"));
        add(passwordField);
        add(loginButton);

        setVisible(true);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new Question12();
    }
}
