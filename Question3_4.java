import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question3_4 extends JFrame implements ActionListener {
    CardLayout crd;
    JButton btn1, btn2, btn3;
    Container cPane;

    Question3_4() {
        cPane = getContentPane();
        crd = new CardLayout();
        cPane.setLayout(crd);

        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        cPane.add("a", btn1);
        cPane.add("b", btn2);
        cPane.add("c", btn3);
    }

    public void actionPerformed(ActionEvent e) {
        crd.next(cPane);
    }

    public static void main(String[] args) {
        Question3_4 crdl = new Question3_4();
        crdl.setSize(300, 300);
        crdl.setVisible(true);
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
