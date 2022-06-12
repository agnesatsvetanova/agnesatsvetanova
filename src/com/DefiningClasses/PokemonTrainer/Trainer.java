package com.DefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String nameTrainer;
    private int badges = 0;
    private List<Pokemon> pokemons = new ArrayList<>();

    public Trainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges() {
        this.badges++;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return this.nameTrainer + " " + this.badges + " " + this.pokemons.size();
    }
}

