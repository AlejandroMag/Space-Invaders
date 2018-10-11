package edu.austral.prog2_2018c2;


import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Commons {

    private final int START_Y = 480;    //280 eje Y de la nave donde comienza y mueve
    private final int START_X = 270;

    private final String playerImg = "src/images/player.png";
    private int width;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {

        ImageIcon ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {

        x += dx;

        if (x <= 2) {
            x = 2;
        }

        if (x >= BOARD_WIDTH - 2 * width) {
            x = BOARD_WIDTH - 2 * width;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = -2;//-2    Velocidad de la nave
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 2;//2      Velocidad e la nave
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = 0;//0      Cuanto mas grande es el numero mas a la derecha
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 0;//0      Igual
        }
    }
}