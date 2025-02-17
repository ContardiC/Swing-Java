package it.spacecoding.swing.text;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okButton;
    public FormPanel(){
        Dimension dim = getPreferredSize();
        // System.out.println(dim.toString());
        dim.width = 250;
        setPreferredSize(dim);
        nameLabel = new JLabel(("Name: "));
        occupationLabel = new JLabel("Occupation: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);

        okButton = new JButton("OK");


        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outBorder,innerBorder));
    }
}
