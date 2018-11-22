package com.magicworld;

import com.magicworld.characters.Character;

import java.util.Scanner;


public class GameLauncher {

    private Scanner scanner;


    public GameLauncher()
    {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Launch the game
     */
    public void lauch()
    {
        this.characterSelection();
    }

    /**
     * Select a character among different categories
     */
    private void characterSelection()
    {

        for(int i = 1; i<3; i++){
            System.out.println("Création du personnge du joueur " + i);
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier 2: Voleur 3: Mage)");

            int selection = scanner.nextInt();

            if(selection <= 0 || selection >= 4){
                System.out.println("Veuillez choisir parmis les choix proposés");
                selection = scanner.nextInt();
            }
            Character character = Character.createCharacter(selection);
        }
    }

    private void characterDescription(Character character)
    {

    }






}
