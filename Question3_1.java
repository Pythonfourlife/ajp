import java.awt.*;

public class Question3_1 extends Frame {
    public Question3_1() {
        super("AWT BorderLayout Example");

        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        setLayout(new BorderLayout());
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question3_1();
    }
}
