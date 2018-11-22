package com.magicworld.characters;

public class Warrior extends Character {

    public boolean specialStrikeExpectation;

    Warrior(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
        specialStrikeExpectation = true;
    }

    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getStrenght());
    }

    public void specialStrike(Character character)
    {
        setHp(getStrenght()/2);
        character.setHp(character.getHp()-getStrenght()*2);
    }

}
