package com.cadmus698;

import com.formdev.flatlaf.FlatDarkLaf;
import org.jibble.jmegahal.JMegaHal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MegaHalWindow extends JFrame{
    private JTextPane textPane1;
    private JPanel mainPanel;
    private JButton sendButton;
    private JTextField textField1;

    private JMegaHal megaHal = new JMegaHal();
    private static ArrayList<Boolean> asked = new ArrayList<>();

    public MegaHalWindow() {
        setContentPane(mainPanel);
        try {
            megaHal.addDocument("src/hamlet.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(asked);
                String question = "";
                String answer = "";
                question = textField1.getText();
                textPane1.setText(textPane1.getText() + "\n USER: " + question);
                megaHal.add(question);
                answer = megaHal.getSentence();
                textPane1.setText(textPane1.getText() + "\n MEGAHAL: " + answer);
                if(Arrays.asList(Brownie.questions).contains(question)){
                    int qNum = Arrays.asList(Brownie.questions).indexOf(question);
                    asked.set(qNum, true);
                    Brownie.answers[qNum][1] = answer;
                }
                if(!asked.contains(false)){
                    System.out.println(asked);
                    close();
                }
            }
        });
    }
    private void close(){
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
    public void run(){
        asked.add(false);
        asked.add(false);
        asked.add(false);
        asked.add(false);
        asked.add(false);
        System.out.println(asked);
        FlatDarkLaf.setup();
        MegaHalWindow gui = new MegaHalWindow();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("MEGAHAL");
        gui.setVisible(true);
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
