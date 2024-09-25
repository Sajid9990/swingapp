package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwingApp {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Press the button!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a button
        JButton button = new JButton("Click Me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Add components to the frame
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(label, java.awt.BorderLayout.CENTER);
        frame.add(button, java.awt.BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}

