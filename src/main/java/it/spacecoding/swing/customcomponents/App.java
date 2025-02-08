package it.spacecoding.swing.customcomponents;

import it.spacecoding.swing.buttonclicks.MainFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFramePanel();
            }
        });
    }
}
