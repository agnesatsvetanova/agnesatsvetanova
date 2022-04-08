package com.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < countCommands; i++) {
            String line = scanner.nextLine();
            String guest = line.substring(0, line.indexOf(" "));
            if (!line.contains("not")){
                if (guests.contains(guest)){
                    System.out.printf("%s is already in the list!%n", guest);
                }else {
                    guests.add(guest);
                }
            } else{
                if(guests.contains(guest)){
                    guests.remove(guest);
                }else {
                    System.out.printf("%s is not on the list!%n", guest);
                }
            }
        }
        for (String guest : guests){
            System.out.println(guest);
        }
    }
}
