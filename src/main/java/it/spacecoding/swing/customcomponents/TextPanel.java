package it.spacecoding.swing.customcomponents;

import javax.swing.*;
import java.awt.BorderLayout;

public class TextPanel extends JPanel {
    private JTextArea textArea;

    public TextPanel(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    public void appendText(String text){
        textArea.append(text);
    }
}
