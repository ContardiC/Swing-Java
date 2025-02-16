package it.spacecoding.swing.size;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dim = getPreferredSize();
        // System.out.println(dim.toString());
        dim.width = 250;
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outBorder,innerBorder));
    }
}
