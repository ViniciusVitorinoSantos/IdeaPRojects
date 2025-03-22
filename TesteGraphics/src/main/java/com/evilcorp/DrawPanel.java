package com.evilcorp;
//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;


public class DrawPanel {
    /**
     * Constructs a new object.
     */
    public DrawPanel() {
        super();
    }

    //Desenha um x apartir dos cantos do painel.
    public void paintComponent(Graphics g) {
        //Chama o painel para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);

        g.drawLine(0, height, width, 0);
    }


}
