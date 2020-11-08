
//************************
//  The SmashUpPanel class
//  Draws the panel and creates
//  the decks.
//
//  Written by: Brianna Cottrill
//********************************

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;

public class SmashUpPanel extends Panel
{
    private Label welcome, choose;
    private TextArea show;
    private Button players2, players3, players4, players5, players6;
    
    public SmashUpPanel ()
    {
        welcome = new Label("Welcome to the Smash Up Deck Chooser!");
        choose = new Label("Please choose the number of players.");

        players2 = new Button("2 Players");
        players3 = new Button("3 Players");
        players4 = new Button("4 Players");
        players5 = new Button("5 Players");
        players6 = new Button("6 Players");

        ButtonListener listener = new ButtonListener();
        players2.addActionListener(listener);
        players3.addActionListener(listener);
        players4.addActionListener(listener);
        players5.addActionListener(listener);
        players6.addActionListener(listener);

        show = new TextArea(10, 40);

        setBackground(Color.cyan);
        setPreferredSize (new Dimension (500, 400));
        add(welcome);
        add(choose);
        add(players2);
        add(players3);
        add(players4);
        add(players5);
        add(players6);
        add(show);

        
    }

    private class ButtonListener implements ActionListener
    {

        public void actionPerformed (ActionEvent event)
        {
            show.setText(" ");
            if(event.getSource() == players2)
                createDecks(2);
            else if(event.getSource() == players3)
                createDecks(3);
            else if(event.getSource() == players4)
                createDecks(4);
            else if(event.getSource() == players5)
                createDecks(5);
            else
                createDecks(6);
            
        }
    

        private void createDecks(int players)
        {
            Random generator = new Random();

            ArrayList<String> factions = new ArrayList<String>();
            //Add all factions to the ArrayList.

            //Base Set.
            factions.add("Pirates");
            factions.add("Ninjas");
            factions.add("Zombies");
            factions.add("Robots");
            factions.add("Dinosaurs");
            factions.add("Wizards");
            factions.add("Tricksters");
            factions.add("Aliens");

            //Science Fiction Double Feature
            factions.add("Time Travellers");
            factions.add("Cyborg Apes");
            factions.add("Super Spies");
            factions.add("Shapeshifters");

            //Monster Smash
            factions.add("Vampires");
            factions.add("Mad Scientists");
            factions.add("Giant Ants");
            factions.add("Werewolves");

            //Pretty Pretty Smash Up
            factions.add("Fairies");
            factions.add("Mythic Horses");
            factions.add("Kitty Cats");
            factions.add("Princesses");

            //The Big Geeky Box
            factions.add("Geeks");

            //Awesome Level 9000
            factions.add("Killer Plants");
            factions.add("Ghosts");
            factions.add("Steampunks");
            factions.add("Bear Cavalry");

            //The Obligatory Cthulu Set
            factions.add("Cthulu Cultists");
            factions.add("Elder Things");
            factions.add("Innsmouth");
            factions.add("Miskatonic University");
            
            //Munchkin
            factions.add("Clerics");
            factions.add("Dwarves");
            factions.add("Elves");
            factions.add("Halflings");
            factions.add("Mages");
            factions.add("Orcs");
            factions.add("Thieves");
            factions.add("Warriors");

            //It's Your Fault
            factions.add("Sharks");
            factions.add("Superheroes");
            factions.add("Dragons");
            factions.add("Mythic Greeks");
            factions.add("Tornados");
            
            //Cease and Desist
            factions.add("Astroknights");
            factions.add("Changerbots");
            factions.add("Ignobles");
            factions.add("Star Roamers");
            
            //Smash Up: Big in Japan
            factions.add("Mega Troopers");
            factions.add("Magical Girls");
            factions.add("Kaiju");
            factions.add("Itty Critters");
            
            //What Were We Thinking
            factions.add("Explorers");
            factions.add("Grannies");
            factions.add("Rock Stars");
            factions.add("Teddy Bears");
            
            //Oops, You Did it Again
            factions.add("Ancient Egyptians");
            factions.add("Cowboys");
            factions.add("Samurai");
            factions.add("Vikings");
            

            int faction1;
            int faction2;

            for(int x = 1; x <= players; x++)
            {
                faction1 = generator.nextInt(factions.size());
                String chosen1 = factions.get(faction1);
                factions.remove(faction1);

                faction2 = generator.nextInt(factions.size());
                String chosen2 = factions.get(faction2);            
                factions.remove(faction2);
            
                show.append("Player " + x + ": " + chosen1 + " + " + chosen2 + "\n ");
            }
        }
    
    }
}
