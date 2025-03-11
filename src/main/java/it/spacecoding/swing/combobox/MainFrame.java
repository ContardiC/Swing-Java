package it.spacecoding.swing.combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frmMain = new JFrame("ComboBox");
        JLabel lblHint = new JLabel("Chose a color: ");
        JLabel lblSelectedColor = new JLabel();
        JComboBox<String> cmbColors;
        frmMain.setSize(640,480);
        frmMain.setLayout(new FlowLayout());
        // Setup ComboBox
        String[] colors = {"red","blue","black"};
        cmbColors = new JComboBox<>(colors);
        frmMain.add(lblHint);
        frmMain.add(cmbColors);
        frmMain.add(lblSelectedColor);
        cmbColors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) cmbColors.getSelectedItem();
                lblSelectedColor.setText(selectedColor);
            }
        });


        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setVisible(true);
    }

}

