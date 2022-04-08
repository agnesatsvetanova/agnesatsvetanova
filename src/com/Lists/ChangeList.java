package com.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Delete ")){
                int delete = Integer.valueOf(command.replace("Delete ", ""));
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == delete){
                        numbers.remove(numbers.get(i));
                    }
                }
            }else if (command.contains("Insert ")){
                command = command.replace("Insert ", "");
                String[] ins = command.split(" ");
                int[] insert = Arrays.stream(ins).mapToInt(e -> Integer.parseInt(e)).toArray();
                numbers.add(insert[1], insert[0]);
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers){
            System.out.print(number + " ");
        }

    }
}
