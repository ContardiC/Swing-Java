package it.spacecoding.swing.toolbars;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrameToolbar();
            }
        });
    }
}
