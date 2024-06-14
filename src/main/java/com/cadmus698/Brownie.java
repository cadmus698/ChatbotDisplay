package com.cadmus698;

import com.formdev.flatlaf.FlatDarkLaf;
import org.jibble.jmegahal.JMegaHal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Brownie extends JFrame{
    public static String[][] answers = new String[5][2];
    public static String[] questions = new String[5];
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton runButton;

    public Brownie (){
        setContentPane(mainPanel);
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questions[0] = textField1.getText();
                questions[1] = textField2.getText();
                questions[2] = textField3.getText();
                questions[3] = textField4.getText();
                questions[4] = textField5.getText();
                for(int i = 0; i < 5; i++) {
                    answers[i][0] = questions[i];
                }
                MegaHalWindow gui = new MegaHalWindow();
                gui.run();
            }
        });
    }

    public static void main(String[] args) throws Exception{
        FlatDarkLaf.setup();
        Brownie gui = new Brownie();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Chatbot Demo");
        gui.setVisible(true);
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
}
