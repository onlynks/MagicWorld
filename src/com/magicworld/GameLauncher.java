package com.magicworld;

import java.util.Scanner;


public class GameLauncher {

    private Scanner scanner;

    public GameLauncher()
    {
        this.scanner = new Scanner(System.in);
    }

    public void lauch()
    {
        this.characterSelection();
    }

    private void characterSelection()
    {
        for(int i = 1; i<3; i++){
            System.out.println("Création du personnge du joueur " + i);
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier 2: Voleur 3: Mage)");

            String test = scanner.next();

            System.out.println(test);


        }

    }



}
