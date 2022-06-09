package com.FuncionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("Party!")){
            String[] split = line.split("\\s+");
            String command = split[0];
            String nextCommand = split[1];
            String sub = split[2];
            if (command.startsWith("Remove")){
                if (nextCommand.equals("StartsWith")){
                    guests = guests.stream().filter(name -> !name.startsWith(sub)).collect(Collectors.toList());
                } else if (nextCommand.equals("EndsWith")){
                    guests = guests.stream().filter(name -> !name.endsWith(sub)).collect(Collectors.toList());
                } else {
                    int length = Integer.parseInt(sub);
                    guests = guests.stream().filter(name -> name.length() != length).collect(Collectors.toList());
                }
            } else {
                if (nextCommand.equals("StartsWith")){
                    guests.addAll(guests.stream().filter(name -> name.startsWith(sub)).collect(Collectors.toList()));
                } else if (nextCommand.equals("EndsWith")){
                    guests.addAll(guests.stream().filter(name -> name.endsWith(sub)).collect(Collectors.toList()));
                } else {
                    int length = Integer.parseInt(sub);
                    guests.addAll(guests.stream().filter(name -> name.length() == length).collect(Collectors.toList()));
                }
            }
            line = scanner.nextLine();
        }
        if (guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            guests = guests.stream().sorted().collect(Collectors.toList());
            String joined = String.join(", ", guests).trim();
            System.out.println(joined + " are going to the party!");
        }
    }
}
//guests.addAll(guests.stream().filter(name -> name.startsWith(sub)).collect(Collectors.toList()));