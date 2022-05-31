package com.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new LinkedHashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.toLowerCase().endsWith("com") && !email.toLowerCase().endsWith("us") && !email.toLowerCase().endsWith("uk")){
                emails.put(name, email);
            }
            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> e : emails.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
