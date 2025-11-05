import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldSwing {
    public static void createAndShowGUI()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Texas Holdem");
        int frameWidth = 1080;
        int frameHeight = 840;
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel gameArea = new JPanel();
        gameArea.setLayout(new GridBagLayout());

        JPanel communityCards = new JPanel();
        communityCards.setSize(new Dimension(1080, 420));
        communityCards.setPreferredSize(new Dimension(1080, 420));
        communityCards.setBackground(Color.yellow);

        JPanel player1 = new JPanel();
        player1.setSize(new Dimension(360,420));
        player1.setPreferredSize(new Dimension(360, 420));
        player1.setBackground(Color.ORANGE);
        


        // -------------------------------------------------------------- \
        // SPECIAL CASE - CURRENTLY NOT FINISHED
        JPanel buttonsAndDeck = new JPanel();
        buttonsAndDeck.setSize(new Dimension(360, 420));
        buttonsAndDeck.setPreferredSize(new Dimension(360, 420));
        buttonsAndDeck.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        buttonsAndDeck.setLayout(new GridBagLayout());

        JPanel buttons = new JPanel();
        buttons.setBackground(Color.BLUE);
        buttons.setSize(new Dimension(360, 210));
        buttons.setPreferredSize(new Dimension(360, 210));
        buttons.setMinimumSize(new Dimension(360, 210));
        // buttons.setLayout();
        JPanel drawPile = new JPanel();
        drawPile.setBackground(Color.MAGENTA);
        drawPile.setSize(new Dimension(180, 210));
        drawPile.setPreferredSize(new Dimension(180, 210));

        JPanel discard = new JPanel();
        discard.setBackground(Color.GREEN);
        discard.setSize(new Dimension(180, 210));
        discard.setPreferredSize(new Dimension(180, 210));

        GridBagConstraints tempC = new GridBagConstraints();
        tempC.anchor = GridBagConstraints.NORTHWEST;
        tempC.fill = GridBagConstraints.BOTH;
        changeConstraints(tempC, 0, 0, 2, 1);
        buttonsAndDeck.add(buttons, tempC);
        changeConstraints(tempC, 0, 1, 1, 1);
        buttonsAndDeck.add(drawPile);
        changeConstraints(tempC, 1, 1, 1, 1);
        buttonsAndDeck.add(discard);

        // -------------------------------------------------------------- \



        JPanel player2 = new JPanel();
        player2.setSize(new Dimension(360, 420));
        player2.setPreferredSize(new Dimension(360, 420));
        player2.setBackground(Color.PINK);

        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.BOTH;

        changeConstraints(c, 0, 0, 3, 1);
        gameArea.add(communityCards, c);

        changeConstraints(c, 0, 1, 1, 1);
        gameArea.add(player1, c);

        changeConstraints(c, 1, 1, 1, 1);
        gameArea.add(buttonsAndDeck, c);

        changeConstraints(c, 2, 1, 1, 1);
        gameArea.add(player2, c);

        frame.add(gameArea);
        frame.setVisible(true);
    }  
    

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void changeConstraints(GridBagConstraints constraints, int x, int y, int width, int height)
	{
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = width;
		constraints.gridheight = height;
	}

   
}
