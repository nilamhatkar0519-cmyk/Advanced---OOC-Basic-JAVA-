import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton submit = new JButton("Submit");
        JLabel result = new JLabel("");

        submit.addActionListener(e -> {
            if (male.isSelected())
                result.setText("Selected: Male");
            else if (female.isSelected())
                result.setText("Selected: Female");
            else
                result.setText("Select Gender");
        });

        frame.add(male);
        frame.add(female);
        frame.add(submit);
        frame.add(result);

        frame.setVisible(true);
    }
}