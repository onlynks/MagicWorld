package com.magicworld.characters;

public class Warrior extends Character {


    Warrior(int level, int strength, int $agility, int intelligence) {
        super(level, strength, $agility, intelligence);
    }

    @Override
    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getStrength());
    }

    @Override
    public void specialStrike(Character character)
    {
        setHp(getHp()-getStrength()/2);
        character.setHp(character.getHp()-getStrength()*2);
    }

}