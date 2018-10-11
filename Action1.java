package edu.austral.prog2_2018c2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame ff= new JFrame("Clicked");
        ff.setVisible(true);
        ff.setResizable(false);
        ff.setSize(200,200);
        JLabel cred= new JLabel("Medina,Maglio,Gayo");
        JPanel panel= new JPanel();
        ff.add(panel);
        panel.add(cred);
    }

}
