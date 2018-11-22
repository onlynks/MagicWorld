package com.magicworld;

import com.magicworld.characters.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class GameLauncher {

    private Scanner scanner;


    GameLauncher()
    {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Launch the game
     */
    void launch()
    {
        List<Character> characters = new ArrayList<>();

        for(int i = 1; i<3; i++){
            characters.add(charactersSelection(i));
            characterDescription(characters.get(i-1), i);
        }

    }

    /**
     * Select a character among different categories
     */
    private Character charactersSelection( int playerNumber)
    {
        Character character;

        System.out.println("Création du personnge du joueur " + playerNumber);
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier 2: Voleur 3: Mage)");

        int selection = scanner.nextInt();

        if(selection <= 0 || selection >= 4){
                System.out.println("Veuillez choisir parmis les choix proposés");
                selection = scanner.nextInt();
        }

        character = Character.createCharacter(selection);

        return character;
    }

    private void characterDescription(Character character, int player)
    {
        String characterScreaming;
        String characterName;

        switch(character.getClass().getSimpleName()){
            case "Warrior":
                characterScreaming = "Woarg ";
                characterName = "Guerrier";
                break;
            case "Robber":
                characterScreaming = "Héhéhé ";
                characterName = "Voleur";
                break;
            case "Wizard":
                characterScreaming = "Abracadabra ";
                characterName = "Magicien";
                break;
            default:
                characterScreaming = null;
                characterName = null;
        }

        System.out.println(characterScreaming + "je suis le " + characterName + " Joueur " + player + ". Je suis level " + character.getLevel()
        + " je possède " + character.getStrenght() + " de force, " + character.getAgility() + " d'abilité et " + character.getInteligente() + " d'intelligence.");
    }






}
