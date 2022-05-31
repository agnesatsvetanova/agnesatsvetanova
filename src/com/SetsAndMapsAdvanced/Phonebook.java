package com.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")){
            String[] split = input.split("-");
            String name = split[0];
            String number = split[1];
            if (!phonebook.containsKey(name)){
                phonebook.put(name, number);
            } else {
                phonebook.computeIfPresent(name, (k, v) -> v = number);
            }

            input = scanner.nextLine();
        }

        String searchedName = scanner.nextLine();
        while (!searchedName.equals("stop")){
            if (phonebook.containsKey(searchedName)){
                System.out.println(searchedName + " -> " + phonebook.get(searchedName));
            } else {
                System.out.println("Contact " + searchedName + " does not exist.");
            }
            searchedName = scanner.nextLine();
        }
    }
}
