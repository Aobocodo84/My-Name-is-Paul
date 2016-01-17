package common;

import javax.swing.*;

/**
 * Created by Nathan on 12/5/2015.
 */
public class TileBorder extends JLabel
{
    public TileBorder(int p, boolean[] region)
    {
        super();

        if (p==0) { //North
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree2.png"));
        }

        if (p==2) { //East
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree5.png"));
        }

        if (p==4) { //South
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree7.png"));
        }

        if (p==6) { //West
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree4.png"));
        }

        if (p==1 && !region[0] && !region[2]) { //Northeast
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree3.png"));
        }

        if (p==3 && !region[2] && !region[4]) { //Southeast
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree8.png"));
        }

        if (p==7 && !region[6] && !region[0]) { //Northwest
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree1.png"));
        }

        if (p==5 && !region[6] && !region[4]) { //Southwest
            this.setIcon(new javax.swing.ImageIcon("./resources/lgTree6.png"));
        }
    }
}
