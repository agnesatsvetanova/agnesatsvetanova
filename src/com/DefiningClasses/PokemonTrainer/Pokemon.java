package com.DefiningClasses.PokemonTrainer;

public class Pokemon {
    private String namePokemon;
    private String element;
    private int health;

    public Pokemon(String namePokemon, String element, int health) {
        this.namePokemon = namePokemon;
        this.element = element;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = this.health - 10;
    }

    public String getElement() {
        return element;
    }
}
