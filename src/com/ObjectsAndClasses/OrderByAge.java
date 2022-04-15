package com.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!line.equals("End")){
            String[] split = line.split("\\s+");
            Person person = new Person(split[0], split[1], Integer.parseInt(split[2]));
            people.add(person);
            line = scanner.nextLine();
        }
        people.sort(Comparator.comparingInt(Person::getAge));
        for (Object person : people){
            System.out.println(person);
        }
    }
    private static class Person{
        String name;
        String ID;
        int age;

        public Person (String name, String ID, int age){
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " with ID: " + ID + " is " + age + " years old.";
        }
    }
}
