package it.spacecoding.swing.customcomponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFramePanel extends JFrame {

    private JButton btn;
    private TextPanel textPanel;

    public MainFramePanel(){
        super("MainFrame with Panel");
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        btn = new JButton("Click Me!");
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
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
