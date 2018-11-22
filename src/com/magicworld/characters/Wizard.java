package com.magicworld.characters;

public class Wizard extends Character {

    private int maxHealth;
    public boolean specialStrikeExpectation;

    Wizard(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
        maxHealth = getHp();
        specialStrikeExpectation = false;
    }

    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getInteligente());
    }

    public void specialStrike()
    {
       int hp = (getInteligente()*2 + getHp() > maxHealth)? maxHealth : getInteligente()*2 + getHp();
       setHp(hp);
    }
}


