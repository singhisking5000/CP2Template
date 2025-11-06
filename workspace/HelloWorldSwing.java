import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldSwing {
    public static void createAndShowGUI()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Texas Holdem");
        int frameWidth = 1280;
        int frameHeight = 720;
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel gameArea = new JPanel();
        gameArea.setLayout(new GridBagLayout());

        JPanel communityCards = new JPanel();
        communityCards.setSize(new Dimension(frameWidth, frameHeight/2));
        communityCards.setPreferredSize(new Dimension(frameWidth, frameHeight/2));
        communityCards.setBackground(Color.yellow);

        JPanel player1 = new JPanel();
        player1.setSize(new Dimension(frameWidth/3, frameHeight/2));
        player1.setPreferredSize(new Dimension(frameWidth/3, frameHeight/2));
        player1.setBackground(Color.ORANGE);
        


        // -------------------------------------------------------------- \
        // SPECIAL CASE - CURRENTLY NOT FINISHED
        JPanel buttonsAndDeck = new JPanel();
        buttonsAndDeck.setSize(new Dimension(frameWidth/3, frameHeight/2));
        buttonsAndDeck.setPreferredSize(new Dimension(frameWidth/3, frameHeight/2));
        //buttonsAndDeck.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        buttonsAndDeck.setLayout(new GridBagLayout());
        
        // INSIDE BUTTONSANDDECK
        JPanel buttons = new JPanel();
        buttons.setBackground(Color.BLUE);
        buttons.setSize(new Dimension(frameWidth/3, frameHeight/4));
        buttons.setPreferredSize(new Dimension(frameWidth/3, frameHeight/4));
        buttons.setMinimumSize(new Dimension(frameWidth/3, frameHeight/4));
        // buttons.setLayout();
        JPanel drawPile = new JPanel();
        drawPile.setBackground(Color.MAGENTA);
        drawPile.setSize(new Dimension(frameWidth/6, frameHeight/4));
        drawPile.setPreferredSize(new Dimension(frameWidth/6, frameHeight/4));
        drawPile.setMinimumSize(new Dimension(frameWidth/6, frameHeight/4));

        JPanel discard = new JPanel();
        discard.setBackground(Color.GREEN);
        discard.setSize(new Dimension(frameWidth/6, frameHeight/4));
        discard.setPreferredSize(new Dimension(frameWidth/6, frameHeight/4));
        discard.setMinimumSize(new Dimension(frameWidth/6, frameHeight/4));
        // -------------------------------------------------------------- \



        JPanel player2 = new JPanel();
        player2.setSize(new Dimension(frameWidth/3, frameHeight/2));
        player2.setPreferredSize(new Dimension(frameWidth/3, frameHeight/2));
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


        
        //
        GridBagConstraints tempC = new GridBagConstraints();
        tempC.anchor = GridBagConstraints.PAGE_START;
        tempC.fill = GridBagConstraints.BOTH;

       // tempC.insets = new Insets(5, 10, 5, 10);
        changeConstraints(tempC, 0, 0, 2, 1);
        buttonsAndDeck.add(buttons, tempC);
        changeConstraints(tempC, 0, 1, 1, 1);
        buttonsAndDeck.add(drawPile, tempC);
        changeConstraints(tempC, 1, 1, 1, 1);
        buttonsAndDeck.add(discard, tempC);

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
