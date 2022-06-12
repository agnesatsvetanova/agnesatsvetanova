package com.DefiningClasses.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personMap = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] split = line.split(" ");
            String name = split[0];
            String classType = split[1];
            if (!personMap.containsKey(name)) {
                Person person = new Person(name);
                personMap.put(name, person);
            }
            if (classType.equals("company")) {
                Company company = new Company(split[2], split[3], Double.parseDouble(split[4]));
                personMap.get(name).setCompany(company);
            } else if (classType.equals("car")) {
                Car car = new Car(split[2], Integer.parseInt(split[3]));
                personMap.get(name).setCar(car);
            } else if (classType.equals("parents")){
                Parent parent = new Parent(split[2], split[3]);
                personMap.get(name).getParents().add(parent);
            } else if (classType.equals("children")){
                Child child = new Child(split[2], split[3]);
                personMap.get(name).getChildren().add(child);
            } else if (classType.equals("pokemon")){
                Pokemon pokemon = new Pokemon(split[2], split[3]);
                personMap.get(name).getPokemons().add(pokemon);
            }
            line = scanner.nextLine();
        }
        String name = scanner.nextLine();
        Person p = personMap.get(name);
        System.out.println(p);
    }
}
