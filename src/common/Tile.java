package common;

import javax.swing.*;

/**
 * Created by Nathan on 10/29/2015.
 */
public class Tile extends JLabel
{
    public Tile(boolean hiDef, int x, int y){
        super();

        if (hiDef) {
            switch (GridInput.grid2[y][x])
            {
                case 0:     this.setIcon(new javax.swing.ImageIcon("./resources/lgGrass.png"));
                            break;

                case 1:     this.setIcon(new javax.swing.ImageIcon("./resources/lgDirt3.png"));
                            break;

                case 2:    this.setIcon(new javax.swing.ImageIcon("./resources/lgTreeFull.png"));
                            break;
            }

        } else {
            this.setIcon(new javax.swing.ImageIcon("./resources/Practice Doge.jpg"));
        }
    }
}
