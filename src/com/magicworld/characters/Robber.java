package com.magicworld.characters;

public class Robber extends Character {

    public boolean specialStrikeExpectation;

    Robber(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
        specialStrikeExpectation = false;
    }

    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getAgility());
    }

    public void specialStrike()
    {
        setAgility(getLevel()*2);
    }
}
