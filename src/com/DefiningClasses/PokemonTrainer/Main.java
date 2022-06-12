package com.DefiningClasses.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("Tournament")) {
            String[] split = line.split(" ");
            String nameTrainer = split[0];
            String namePokemon = split[1];
            String element = split[2];
            int health = Integer.parseInt(split[3]);
            Pokemon pokemon = new Pokemon(namePokemon, element, health);
            if (!trainerMap.containsKey(nameTrainer)) {
                Trainer trainer = new Trainer(nameTrainer);
                trainer.addPokemon(pokemon);
                trainerMap.put(nameTrainer, trainer);
            } else {
                Trainer trainer = trainerMap.get(nameTrainer);
                trainer.addPokemon(pokemon);
                trainerMap.put(nameTrainer, trainer);
            }
            line = scanner.nextLine();
        }

        String element = scanner.nextLine();
        while (!element.equals("End")) {
            for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                Trainer tr = entry.getValue();
                List<Pokemon> pokemons = tr.getPokemons();
                boolean isPresent = false;
                for (Pokemon p : pokemons) {
                    if (p.getElement().equals(element)) {
                        isPresent = true;
                    }
                }
                if (isPresent == true) {
                    tr.setBadges();
                } else {
                    for (Pokemon p : pokemons) {
                        p.setHealth();
                    }
                }
                pokemons = pokemons.stream().filter(p -> p.getHealth() > 0).collect(Collectors.toList());
                tr.setPokemons(pokemons);
            }
            element = scanner.nextLine();
        }
        List<Trainer> trainers = new ArrayList<>();
        for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
            Trainer tr = entry.getValue();
            trainers.add(tr);
        }

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o2.getBadges() - (o1.getBadges());
            }
        });
        for (Trainer t : trainers) {
            System.out.println(t);
        }
    }
}
