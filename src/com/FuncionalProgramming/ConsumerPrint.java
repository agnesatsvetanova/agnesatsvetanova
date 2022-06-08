package com.FuncionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Consumer<String> printInput = word -> System.out.println(word);
        for (int i = 0; i < input.length; i++) {
            String w = input[i];
            printInput.accept(w);
        }


    }
}
