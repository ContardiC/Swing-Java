package it.spacecoding.swing.size;

import java.awt.Dimension;

import javax.swing.*;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dim = getPreferredSize();
        // System.out.println(dim.toString());
        dim.width = 250;
        setPreferredSize(dim);
        setBorder(BorderFactory.createTitledBorder("Add Person"));
    }
}
