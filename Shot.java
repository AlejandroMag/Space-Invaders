package edu.austral.prog2_2018c2;

import javax.swing.ImageIcon;

public class Shot extends Sprite {

    private final String shotImg = "src/images/shot.png";
    private final int H_SPACE = 6;  //6 donde se origina el disparo de izq a derecha
    private final int V_SPACE = 1;  //1 donde se origina de arriba a abajo

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        ImageIcon ii = new ImageIcon(shotImg);

            setImage(ii.getImage());

            setX(x + H_SPACE);
            setY(y - V_SPACE);


    }
}
