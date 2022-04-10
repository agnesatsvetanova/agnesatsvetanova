package com.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int added = Integer.valueOf(command.replace("Add ", ""));
                numbers.add(added);
            } else if (command.contains("Insert ")) {
                command = command.replace("Insert ", "");
                String[] ins = command.split(" ");
                int[] insert = Arrays.stream(ins).mapToInt(e -> Integer.parseInt(e)).toArray();
                int index = insert[1];
                int elem = insert[0];
                if (numbers.size() <= insert[1]) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, elem);
                }
            } else if (command.contains("Remove")) {
                int removed = Integer.valueOf(command.replace("Remove ", ""));
                if (numbers.size() <= removed) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(removed);
                }
            } else if (command.contains("Shift ")) {
                command = command.replace("Shift ", "");
                if (command.contains("left ")){
                    int shiftedLeft = Integer.valueOf(command.replace("left ", ""));
                    for (int i = 0; i < shiftedLeft; i++) {
                        numbers.add(numbers.get(0));
                        numbers.remove(0);
                    }
                } else if (command.contains("right ")){
                    int shiftedRight = Integer.valueOf(command.replace("right ", ""));
                    for (int i = 0; i < shiftedRight; i++) {
                        numbers.add(0, numbers.get(numbers.size()-1));
                        numbers.remove(numbers.size()-1);
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer number:numbers){
            System.out.print(number + " ");
        }
    }
}