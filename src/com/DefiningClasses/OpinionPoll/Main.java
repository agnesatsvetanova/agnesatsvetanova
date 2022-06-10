package com.DefiningClasses.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] split = line.split("\\s+");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            Person person = new Person(name, age);
            persons.add(person);
        }

        persons = persons.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person p: persons) {
            System.out.println(p);
        }
    }
}
