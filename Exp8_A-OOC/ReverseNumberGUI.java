import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JTextField input = new JTextField(10);
        JButton btn = new JButton("Reverse");
        JLabel result = new JLabel("Result");

        btn.addActionListener(e -> {
            String num = input.getText();
            String rev = new StringBuilder(num).reverse().toString();
            result.setText("Result: " + rev);
        });

        frame.add(new JLabel("Enter Number:"));
        frame.add(input);
        frame.add(btn);
        frame.add(result);

        frame.setVisible(true);
    }
}