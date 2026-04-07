import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class counterGUI{
	public static void main(String[] args){
		JFrame frame = new JFrame("Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());

		JLabel label = new JLabel("Counter");
        JTextField text = new JTextField("0",10);

        JButton up = new JButton("Count Up");
        JButton down = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        // Count Up
        up.addActionListener(e -> {
            int value = Integer.parseInt(text.getText());
            text.setText(String.valueOf(value + 1));
        });

        // Count Down
        down.addActionListener(e -> {
            int value = Integer.parseInt(text.getText());
            text.setText(String.valueOf(value - 1));
        });

        // Reset
        reset.addActionListener(e -> text.setText("0"));

        frame.add(label);
        frame.add(text);
        frame.add(up);
        frame.add(down);
        frame.add(reset);

        frame.setVisible(true);
    }
}
