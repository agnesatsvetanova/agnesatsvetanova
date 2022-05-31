package com.SetsAndMapsAdvanced;

import java.security.KeyStore;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            if (!names.contains(name)){
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
