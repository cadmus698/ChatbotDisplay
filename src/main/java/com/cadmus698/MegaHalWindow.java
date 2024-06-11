package com.cadmus698;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MegaHalWindow extends JFrame{
    private JTextPane textPane1;
    private JPanel mainPanel;
    private JButton sendButton;
    private JTextField textField1;

    public MegaHalWindow() {
        setContentPane(mainPanel);
    }

    public void run(){
        FlatDarkLaf.setup();
        MegaHalWindow gui = new MegaHalWindow();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("MEGAHAL");
        gui.setVisible(true);
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ArrayList<Boolean> asked = new ArrayList<>();
        asked.add(false);asked.add(false);asked.add(false);asked.add(false);asked.add(false);
        while(asked.contains(false)){

        }
    }
}
