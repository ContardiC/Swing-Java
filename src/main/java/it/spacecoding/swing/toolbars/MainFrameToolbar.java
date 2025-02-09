package it.spacecoding.swing.toolbars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameToolbar extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    public MainFrameToolbar(){
        super("MainFrame with Panel");
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);



        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
