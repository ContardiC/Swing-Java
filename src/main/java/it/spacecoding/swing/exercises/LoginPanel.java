package it.spacecoding.swing.exercises;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.*;

public class LoginPanel extends JPanel{
    JLabel emaiLabel;
    JLabel passwordLabel;
    JTextField emailField;
    JTextField passwordField;
    JButton sendButton;
    public LoginPanel(){
        super();
        emaiLabel = new JLabel("Email");
        emailField = new JTextField(10);
        passwordLabel = new JLabel("Password");
        passwordField = new JTextField(10);
        sendButton = new JButton("Send");
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(emaiLabel, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        add(emailField, gc);
        Border border = BorderFactory.createTitledBorder("Login");
        setBorder(border);
        //TODO: Insert code here
    }
}