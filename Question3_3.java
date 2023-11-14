import java.awt.*;

public class Question3_3 extends Frame {
    public Question3_3() {
        super("AWT GridLayout Example");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        setLayout(new GridLayout(2, 2));
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question3_3();
    }
}
