package com.InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<String> dates = new ArrayList<>();

        while (!line.equals("End")) {
            if (line.startsWith("Citizen")) {
                String[] tokens = line.split(" ");
                String date = tokens[4];
                dates.add(date);
            } else if (line.startsWith("Pet")) {
                String[] tokens = line.split(" ");
                String date = tokens[2];
                dates.add(date);
            }

            line = scanner.nextLine();
        }

        String searchedYear = scanner.nextLine();

        List<String> matches = new ArrayList<>();
        for (String date : dates) {
            String[] tokens = date.split("/");
            String year = tokens[2];
            if (year.equals(searchedYear)) {
                matches.add(date);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("<no output>");
        } else {
            for (String date : matches){
                System.out.println(date);
            }
        }
    }
}
