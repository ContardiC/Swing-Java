package it.spacecoding.swing.exercises;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private LoginPanel loginPanel;
    public MainFrame(){
        super();
        setTitle("Exercise");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPanel = new LoginPanel();
        setLayout(new BorderLayout());
        add(loginPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}