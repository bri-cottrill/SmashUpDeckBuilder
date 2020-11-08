//**********************************
//  The Smash Up Deck Generator
//  This program randomly generates
//  two-faction Smash Up decks for each
//  player entered.
//
//  Written by: Brianna Cottrill
//***************************************

import javax.swing.JFrame;

public class SmashUp
{
    public static void main (String[] args)
    {
        JFrame frame = new JFrame("The Smash Up Deck Chooser");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        SmashUpPanel panel = new SmashUpPanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
