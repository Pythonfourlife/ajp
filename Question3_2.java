import java.awt.*;

public class Question3_2 extends Frame {
    public Question3_2() {
        super("AWT FlowLayout Example");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        setLayout(new FlowLayout());
        add(button1);
        add(button2);
        add(button3);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question3_2();
    }
}
