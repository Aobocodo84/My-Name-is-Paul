/*
* Created by Nathan Shrum
* 11/3/2015
*
* Credit for tree tile: Psychotic_Carp
* http://pixeljoint.com/forum/forum_posts.asp?TID=2306&PD=0
*/

package common;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startup extends JFrame
{
    private JButton buttonResizeYes, buttonResizeNo;

    public Startup()
    {
        createView();

        setTitle("Tons of fun stuff");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,125);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("Super High Definition Screen?");
        panel.add(label);

        buttonResizeYes = new JButton("Yes");
        buttonResizeYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameWindow(true).setVisible(true);
                dispose();
            }
        });
        panel.add(buttonResizeYes);

        buttonResizeNo = new JButton("No");
        buttonResizeNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameWindow(false).setVisible(true);
                dispose();
            }
        });
        panel.add(buttonResizeNo);

    }

    public static void main(String[] args)
    {
        new Startup().setVisible(true);

        while (true) {}

    }

}
