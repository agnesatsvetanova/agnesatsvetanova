package com.Maps;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> forceBook = new LinkedHashMap<>();
        Map<String, String> forceUsers = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String[] input = command.split(" \\| ");
                String side = input[0];
                String user = input[1];
                List<String> users = new ArrayList<>();
                if (!forceBook.containsKey(side)) {
                    users.add(user);
                    forceBook.put(side, users);
                    forceUsers.put(user, side);
                } else {
                    if (forceUsers.containsKey(side)) {
                        continue;
                    } else {
                        users = forceBook.get(side);
                        users.add(user);
                        forceBook.put(side, users);
                        forceUsers.put(user, side);
                    }
                }
            } else {
                String[] input = command.split(" -> ");
                String side = input[1];
                String user = input[0];
                List<String> users = new ArrayList<>();
                if (!forceBook.containsKey(side)) {
                    users.add(user);
                    forceBook.put(side, users);
                    forceUsers.put(user, side);
                    System.out.println(user + " joins the " + side +" side!");
                } else {
                    if (forceUsers.containsKey(user)) {
                        // Remove the user from his current side
                        String currentSide = forceUsers.get(user);
                        users = forceBook.get(currentSide);
                        users.remove(user);
                        forceBook.put(currentSide, users);
                        // Add the user to the new side
                        users = forceBook.get(side);
                        users.add(user);
                        forceBook.put(side, users);
                        forceUsers.put(user, side);
                        System.out.println(user + " joins the " + side +" side!");
                    } else {
                        users = forceBook.get(side);
                        users.add(user);
                        forceBook.put(side, users);
                        forceUsers.put(user, side);
                        System.out.println(user + " joins the " + side +" side!");
                    }
                }
            }
            command = scanner.nextLine();
        }
        for(Map.Entry<String, List<String>> entry: forceBook.entrySet()) {
            if(!entry.getValue().isEmpty()) {
                System.out.println("Side: " + entry.getKey() + ", Members:" + entry.getValue().size());
                for (String user : entry.getValue()) {
                    System.out.println("! " + user);
                }
            }
        }

    }
}
