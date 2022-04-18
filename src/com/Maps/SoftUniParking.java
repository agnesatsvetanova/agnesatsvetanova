package com.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, String> clients = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("register ")) {
                command = command.replace("register ", "");
                String[] user = command.split("\\s+");
                String name = user[0];
                String number = user[1];
                if (clients.containsKey(name)) {
                    System.out.println("ERROR: already registered with plate number " + number);
                } else {
                    clients.put(name, number);
                    System.out.println(name + " registered " + number + " successfully");
                }
            } else {
                command = command.replace("unregister ", "");
                String[] user = command.split("\\s+");
                String name = user[0];
                if (!clients.containsKey(name)) {
                    System.out.println("ERROR: user " + name + " not found");
                } else {
                    System.out.println(name + " unregistered successfully");
                    clients.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> c : clients.entrySet()) {
            System.out.println(c.getKey() + " => " + c.getValue());
        }
    }
}
