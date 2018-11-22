package com.magicworld.characters;

public class Warrior extends Character {


    Warrior(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
    }

    @Override
    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getStrenght());
    }

    @Override
    public void specialStrike(Character character)
    {
        setHp(getHp()-getStrenght()/2);
        character.setHp(character.getHp()-getStrenght()*2);
    }

}