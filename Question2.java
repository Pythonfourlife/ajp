import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question2 extends JFrame {
    JLabel nameLabel, ageLabel, genderLabel, addressLabel, cityLabel, departmentLabel;
    JTextField nameText, ageText;
    JRadioButton maleRadioButton, femaleRadioButton;
    ButtonGroup genderGroup;
    JTextArea addressTextArea;
    JComboBox<String> cityChoice, departmentComboBox;
    JButton submitButton, resetButton;

    Question2() {
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        addressLabel = new JLabel("Address:");
        cityLabel = new JLabel("City:");
        departmentLabel = new JLabel("Department:");

        nameText = new JTextField();
        ageText = new JTextField();

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        addressTextArea = new JTextArea(4, 20);
        cityChoice = new JComboBox<>(
                new String[] { "Select", "New York", "Los Angeles", "Chicago", "Houston", "Other" });
        departmentComboBox = new JComboBox<>(new String[] { "Select", "Computer Science", "Electrical Engineering",
                "Mechanical Engineering", "Civil Engineering", "Other" });

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        setLayout(new FlowLayout());

        add(nameLabel);
        add(nameText);
        add(ageLabel);
        add(ageText);
        add(genderLabel);
        add(maleRadioButton);
        add(new JLabel()); // Empty label for alignment
        add(femaleRadioButton);
        add(addressLabel);
        add(new JScrollPane(addressTextArea));
        add(cityLabel);
        add(cityChoice);
        add(departmentLabel);
        add(departmentComboBox);
        add(new JLabel()); // Empty label for alignment
        add(submitButton);
        add(resetButton);

        setTitle("Admission Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question2();
    }
}
