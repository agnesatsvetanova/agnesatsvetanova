package com.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> wagons = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")){
                int people = Integer.valueOf(command.replace("Add ", ""));
                wagons.add(people);
            } else {
                int passengers = Integer.valueOf(command);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= capacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for(Integer wagon : wagons) {
            System.out.print( wagon + " ");
        }
    }
}
