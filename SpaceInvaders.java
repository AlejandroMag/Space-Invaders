package edu.austral.prog2_2018c2;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame implements Commons {

    public SpaceInvaders(int start)  { // le meti yo el int
        if(start==1) {
            initUI();
        }
    }

    private void initUI()  {

        add(new Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpaceInvaders ex = new SpaceInvaders(1);
            ex.setVisible(true);
            Sprite ej = new Sprite();   //de aca lo metimos nosotros
            ej.setVisible(true);
        });
    }
}