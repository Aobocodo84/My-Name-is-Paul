package common;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nathan on 11/13/2015.
 */
public class Decoration extends JLayeredPane {

    private int x, y;
    private boolean hiDef;
    private boolean[] region;

    public Decoration(boolean h, int x1, int y1){
        super();
        this.setLayout(new GridBagLayout());

        setPreferredSize(new Dimension(128, 128));
        x = x1;
        y = y1;
        hiDef = h;

        //region = selectRegions();
        addStuff();

        this.setOpaque(false);
        this.repaint();
    }


    public void addStuff(){
        //super.paintComponent(g);
       // g.setColor(Color.black);
        if (region[0]) { //North
            //g.drawImage
            JLabel labelN = new JLabel();
            labelN.setIcon(new javax.swing.ImageIcon("./resources/lgTree2.png"));
            labelN.setOpaque(false);
            this.add(labelN, 3);
        }

        if (region[2]) { //East
            //g.fillRect(0, 32, 32, 64);
            JLabel labelE = new JLabel();
            labelE.setIcon(new javax.swing.ImageIcon("./resources/lgTree5.png"));
            labelE.setOpaque(false);
            this.add(labelE, 2);
        }

        if (region[4]) { //South
            //g.fillRect(32, 0, 64, 32);
            JLabel labelS = new JLabel();
            labelS.setIcon(new javax.swing.ImageIcon("./resources/lgTree7.png"));
            labelS.setOpaque(false);
            this.add(labelS, 1);
        }

        if (region[6]) { //West
            //g.fillRect(96, 32, 32, 64);
            JLabel labelW = new JLabel();
            labelW.setIcon(new javax.swing.ImageIcon("./resources/lgTree4.png"));
            labelW.setOpaque(false);
            this.add(labelW, 0);
        }

        if (region[1] && !region[0] && !region[2]) { //Northeast
            //g.fillRect(0, 96, 32 , 32);
        }

        if (region[3] && !region[2] && !region[4]) { //Southeast
            //g.fillRect(0, 0, 32 , 32);
        }

        if (region[5] && !region[6] && !region[0]) { //Northwest
            //g.fillRect(96, 96, 32 , 32);
        }

        if (region[7] && !region[6] && !region[4]) { //Southwest
            //g.fillRect(96, 0, 32 , 32);
        }
        this.repaint();
    }


    }

