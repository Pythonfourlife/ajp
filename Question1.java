import java.awt.*;

public class Question1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Bio-data Form");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label genderLabel = new Label("Gender:");
        CheckboxGroup genderCheckboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderCheckboxGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);

        Label hobbiesLabel = new Label("Hobbies:");
        Checkbox readingCheckbox = new Checkbox("Reading");
        Checkbox musicCheckbox = new Checkbox("Music");
        Checkbox sportsCheckbox = new Checkbox("Sports");

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

        Button submitButton = new Button("Submit");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(genderLabel);
        frame.add(maleCheckbox);
        frame.add(new Label()); // Empty cell for alignment
        frame.add(femaleCheckbox);
        frame.add(hobbiesLabel);
        frame.add(readingCheckbox);
        frame.add(new Label()); // Empty cell for alignment
        frame.add(musicCheckbox);
        frame.add(new Label()); // Empty cell for alignment
        frame.add(sportsCheckbox);
        frame.add(addressLabel);
        frame.add(addressTextArea);
        frame.add(cityLabel);
        frame.add(cityChoice);
        frame.add(new Label()); // Empty cell for alignment
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
