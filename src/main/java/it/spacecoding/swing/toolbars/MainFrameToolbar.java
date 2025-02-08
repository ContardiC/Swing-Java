package it.spacecoding.swing.toolbars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameToolbar extends JFrame {

    private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;
    public MainFrameToolbar(){
        super("MainFrame with Panel");
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        btn = new JButton("Click Me!");
        toolbar = new Toolbar();
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);
        // TODO: Communications Between Components
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
