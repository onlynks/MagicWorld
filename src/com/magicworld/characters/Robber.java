package com.magicworld.characters;

public class Robber extends Character {

    Robber(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
    }

    @Override
    public void normalStrike(Character character)

    {
        character.setHp(character.getHp()-getAgility());
    }

    @Override
    public void specialStrike(Character character)

    {
        setAgility(getLevel()*2);
    }
}
