package com.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] l = line.split(" ");
            persons.add(new Person(l[0], Integer.valueOf(l[1])));
        }
        for (Person p : persons) {
            if (p.isOver30()){
                System.out.println(p);
            }
        }


    }
    private static class Person {
        private String name;
        private int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public boolean isOver30(){
            return age >= 30;
        }

        @Override
        public String toString() {
            return name + " - " + age;
        }
    }
}
