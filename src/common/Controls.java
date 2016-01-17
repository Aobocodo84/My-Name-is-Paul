package common;

import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by bmaxf on 1/17/2016.
 */


/*
 * Look up values for each key in java api for KeyEvent:
 *
 * https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
 */

public class Controls implements KeyListener
{
    private GameWindow gameWindow;

    public Controls(GameWindow gameWindow)
    {
        super();
        this.gameWindow = gameWindow;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_KP_UP || e.getKeyCode() == KeyEvent.VK_UP)
        {
            // Write code perform result of key type
            gameWindow.getContentPane(); // so on and so forth.
        }

        if (e.getKeyCode() == KeyEvent.OTHER_KEY_HERE)
        {}

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_KP_UP || e.getKeyCode() == KeyEvent.VK_UP)
        {
            // Write code perform result of key being pressed.
            gameWindow.getContentPane(); // so on and so forth.
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_KP_UP || e.getKeyCode() == KeyEvent.VK_UP)
        {
            // Write code perform result of key being released.
            gameWindow.getContentPane(); // so on and so forth.
        }
    }
}
