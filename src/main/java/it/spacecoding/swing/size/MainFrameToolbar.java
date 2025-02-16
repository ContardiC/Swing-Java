package it.spacecoding.swing.size;

import javax.swing.*;
import java.awt.*;

public class MainFrameToolbar extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;
    public MainFrameToolbar(){
        super("MainFrame with Panel");
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();
        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
        add(formPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);



        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
