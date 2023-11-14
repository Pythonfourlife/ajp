import java.awt.*;
import java.awt.event.*;

class Question1_2 extends Frame {
    Label nameLabel, ageLabel, genderLabel;
    TextField nameText, ageText;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    Button submitButton;

    Question1_2() {
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        genderLabel = new Label("Gender:");

        nameText = new TextField();
        ageText = new TextField();

        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        Label addressLabel = new Label("Address:");
        TextArea addressTextArea = new TextArea(4, 20);
        Label cityLabel = new Label("City:");
        Choice cityChoice = new Choice();
        cityChoice.add("Select");
        cityChoice.add("New York");
        cityChoice.add("Los Angeles");
        cityChoice.add("Chicago");
        cityChoice.add("Houston");
        cityChoice.add("Other");

        submitButton = new Button("Submit");
        Button resetButton = new Button("Reset");

        setLayout(new FlowLayout());

        add(nameLabel);
        add(nameText);
        add(ageLabel);
        add(ageText);
        add(genderLabel);
        add(maleCheckbox);
        add(new Label()); // Empty label for alignment
        add(femaleCheckbox);
        add(addressLabel);
        add(addressTextArea);
        add(cityLabel);
        add(cityChoice);
        add(new Label()); // Empty label for alignment
        add(submitButton);
        add(resetButton);
        setTitle("Admission Form");
        setSize(400, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Question1_2();
    }
}
