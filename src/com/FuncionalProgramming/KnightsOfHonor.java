package com.FuncionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Consumer<String> printInput = word -> System.out.println("Sir " + word);
        for (int i = 0; i < input.length; i++) {
            String name = input[i];
            printInput.accept(name);
        }

    }
}
