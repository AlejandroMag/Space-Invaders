package edu.austral.prog2_2018c2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action3 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
       SpaceInvaders ex= new SpaceInvaders(1);
        ex.setVisible(true);
        Sprite ej = new Sprite();   //de aca lo metimos nosotros
        ej.setVisible(true);

    }
}
