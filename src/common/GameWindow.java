package common;


import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame
{
    private boolean hiDef = false;

    public GameWindow(boolean h){
        if(h) {hiDef = true;}

        if(h){setSize(3000,1700);}
        else {setSize(1500,900);}

        createGameScreen();

        // To perform actions on GameWindow when a key is pressed, modify Controls.java
        this.addKeyListener(new Controls(this));

        setTitle("Swiggity swag, what's in the bag?");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createGameScreen() {

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout());
        getContentPane().add(panelMain);

        //North
        JPanel panelNorth = new JPanel(new BorderLayout());
        panelMain.add(panelNorth, BorderLayout.NORTH);
        JLabel test = new JLabel();
        if (hiDef) {
            test.setText("This is a high definition screen");
            test.setFont(new Font("arial", Font.PLAIN, 30));
        } else {
            test.setText("This is not a high definition screen");
        }
        panelNorth.add(test);

        //Center
        JLayeredPane gameGrid = new JLayeredPane();
        gameGrid.setLayout(new GridBagLayout());
        panelMain.add(gameGrid);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;


        for (int k = 0; k < 10; k++) {

            for (int j = 0; j < 16; j++) {
                Tile newTile = new Tile(hiDef, j, k);

                gameGrid.add(newTile, c, 10);

                boolean[] r = selectRegions(j, k);
                int level = 9;

                for(int h = 0; h < 8; h++)
                {
                   if(r[h])
                   {
                       TileBorder newTileBorder = new TileBorder(h, r);

                       newTileBorder.setOpaque(false);
                       gameGrid.add(newTileBorder, c, level);
                       level--;
                   }
                }

                c.gridx++;
            }

            c.gridx = 0;
            c.gridy++;
        }
    }
    private boolean[] selectRegions(int x, int y) {
        boolean regions[] = new boolean[8];

        if (x < 15) {
            if (y < 9) {
                if (GridInput.grid2[y + 1][x + 1] == 2 && GridInput.grid2[y + 1][x + 1] != GridInput.grid2[y][x]) regions[7] = true;
            }
            if (y > 0) {
                if (GridInput.grid2[y - 1][x + 1] == 2 && GridInput.grid2[y - 1][x + 1] != GridInput.grid2[y][x]) regions[5] = true;
            }
            if (GridInput.grid2[y][x + 1] == 2 && GridInput.grid2[y][x + 1] != GridInput.grid2[y][x]) regions[6] = true;
        }

        if (x > 0) {
            if (y < 9) {
                if (GridInput.grid2[y + 1][x - 1] == 2 && GridInput.grid2[y + 1][x - 1] != GridInput.grid2[y][x]) regions[1] = true;
            }
            if (y > 0) {
                if (GridInput.grid2[y - 1][x - 1] == 2 && GridInput.grid2[y - 1][x - 1] != GridInput.grid2[y][x]) regions[3] = true;
            }
            if (GridInput.grid2[y][x - 1] == 2 && GridInput.grid2[y][x - 1] != GridInput.grid2[y][x]) regions[2] = true;
        }

        if (y < 9) {
            if (GridInput.grid2[y + 1][x] == 2 && GridInput.grid2[y + 1][x] != GridInput.grid2[y][x]) regions[0] = true;
        }
        if (y > 0) {
            if (GridInput.grid2[y - 1][x] == 2 && GridInput.grid2[y - 1][x] != GridInput.grid2[y][x]) regions[4] = true;
        }

        return regions;
}

}
