package it.spacecoding.swing.forms;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel bottomPanel;
    private JTextField textField;
    private JButton sendButton;
    private JLabel dataLabel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup buttonGroup;
    public MainFrame(){
        setTitle("Form");
        // TOP PANEL
        topPanel = new JPanel();
        textField = new JTextField();
        textField.setColumns(10);
        sendButton = new JButton("Submit");
        topPanel.add(textField);
        topPanel.add(sendButton);
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        // MID PANEL
        midPanel = new JPanel();
        radioButton1 = new JRadioButton("Opzione 1");
        radioButton2 = new JRadioButton("Opzione 2");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        midPanel.add(radioButton1);
        midPanel.add(radioButton2);
        add(midPanel, BorderLayout.CENTER);
        // BOTTOM PANEL
        bottomPanel = new JPanel();
        dataLabel = new JLabel("Qui verranno mostrati i dati...");
        bottomPanel.add(dataLabel);
        add(bottomPanel, BorderLayout.SOUTH);
        // Click listener
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Text: ";
                message += textField.getText();




                dataLabel.setText(message);
            }
        });
        setSize(640,480);
        setVisible(true);
    }
}
