package com.magicworld.characters;

import java.util.Scanner;

public abstract class Character {

    private int level;
    private int hp;
    private int strength;
    private int agility;
    private int intelligence;

    Character(int level, int strength, int agility, int intelligence){
        setLevel(level);
        setHp(level*5);
        setStrength(strength);
        setAgility(agility);
        setIntelligence(intelligence);
    }

    public void normalStrike(Character character)
    {
    }

    public void specialStrike(Character character)
    {
    }

    /**
     * Create a character depending of his category
     * include the entire procedure of creation
     * @return character
     */
    public static Character createCharacter(int category)
    {
        int data[] = provider();

        Character character;

        switch(category){
            case 1:
                Warrior warrior = new Warrior(data[0], data[1], data[2], data[3]);
                character =  warrior;
                break;
            case 2:
                Robber robber = new Robber(data[0], data[1], data[2], data[3]);
                character = robber;
                break;
            case 3:
                Wizard wizard = new Wizard(data[0], data[1], data[2], data[3]);
                character = wizard;
                break;
            default:
                return null;
        }

        return character;
    }

    /**
     * Provide character features
     * @return 4 amounts of features
     */
    private static int[] provider()
    {
        Scanner scanner = new Scanner(System.in);
        int data[] = new int[4];

        System.out.println("Niveau du personnage?");
        int level = scanner.nextInt();
        data[0] = level;

        if(level <= 0 || level > 100){
            System.out.println("Doit être compris entre 1 et 100");
            data[0] = scanner.nextInt();
        }

        data[1] = askAmount(data[0], "Force");
        data[2] = ( data[0]-data[1] > 0)? askAmount(data[0]-data[1], "Agilité"): 0;
        data[3] = ( data[0]-data[1]-data[2] > 0)? askAmount(data[0]-data[1]-data[2], "Intelligence") : 0;

        return data;
    }

    /**
     * Display the form to user and return result
     * @return feature amount
     */
    private static int askAmount(int points, String feature)
    {
        Scanner scanner = new Scanner(System.in);
        int featureAmount;

        System.out.println(feature + " du personnage?");
        featureAmount = scanner.nextInt();

        if(featureAmount < 0 || featureAmount > 100){
            System.out.println("Doit être compris entre 0 et 100");
            featureAmount = scanner.nextInt();
        }

        if(points - featureAmount <= 0 && points - featureAmount != 0)
        System.out.println("Vous n'avez plus de points disponible");

        return featureAmount;
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    protected void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    private void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
