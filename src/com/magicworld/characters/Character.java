package com.magicworld.characters;

public abstract class Character {

    private int level;
    private int hp;
    private int strenght;
    private int agility;
    private int inteligente;

    public Character(int level, int hp, int strenght, int $agility, int inteligente){
        setLevel(level);
        setHp(hp);
        setStrenght(strenght);
        setAgility($agility);
        setInteligente(inteligente);

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int $agility) {
        this.agility = $agility;
    }

    public int getInteligente() {
        return inteligente;
    }

    public void setInteligente(int inteligente) {
        this.inteligente = inteligente;
    }
}
