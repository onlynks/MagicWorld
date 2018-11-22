package com.magicworld.characters;

public class Robber extends Character {

    public boolean specialStrikeExpectation;

    Robber(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
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
