package com.InterfacesAndAbstraction.FoodShortage;

import com.InterfacesAndAbstraction.DefineAnInterfacePerson.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> citizens = new ArrayList<>();
        List<String> rebels = new ArrayList<>();
        int totalFood = 0;

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (line.length == 4){
                citizens.add(line[0]);
            } else {
                rebels.add(line[0]);
            }
        }

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            for (String c : citizens){
                if (c.equals(name)) {
                    totalFood += 10;
                }
            }

            for (String r : rebels){
                if (r.equals(name)) {
                    totalFood += 5;
                }
            }

            name = scanner.nextLine();
        }

        System.out.println(totalFood);
    }
}
