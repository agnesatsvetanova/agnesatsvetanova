package com.FuncionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<Integer, Integer> add = n -> n + 1;
        Function<Integer, Integer> multiply = n -> n * 2;
        Function<Integer, Integer> subtract = n -> n - 1;
        Consumer<Integer> print = n -> System.out.print(n + " ");

        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.equals("add")){
                numbers = numbers.stream().map(add).collect(Collectors.toList());
            } else if (command.equals("multiply")){
                numbers = numbers.stream().map(multiply).collect(Collectors.toList());
            } else if (command.equals("subtract")){
                numbers = numbers.stream().map(subtract).collect(Collectors.toList());
            } else if (command.equals("print")) {
                for (Integer n : numbers){
                    print.accept(n);
                }
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
