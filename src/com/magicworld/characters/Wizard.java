package com.magicworld.characters;

public class Wizard extends Character {

    private int maxHealth;

    Wizard(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        maxHealth = getHp();
    }

    @Override
    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getIntelligence());
    }

    @Override
    public void specialStrike(Character character)
    {
       int hp = (getIntelligence()*2 + getHp() > maxHealth)? maxHealth : getIntelligence()*2 + getHp();
       setHp(hp);
    }
}


