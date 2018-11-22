package com.magicworld.characters;

public class Wizard extends Character {

    private int maxHealth;

    Wizard(int level, int strenght, int $agility, int inteligente) {
        super(level, strenght, $agility, inteligente);
        maxHealth = getHp();
    }

    @Override
    public void normalStrike(Character character)
    {
        character.setHp(character.getHp()-getInteligente());
    }

    @Override
    public void specialStrike(Character character)
    {
       int hp = (getInteligente()*2 + getHp() > maxHealth)? maxHealth : getInteligente()*2 + getHp();
       setHp(hp);
    }
}


