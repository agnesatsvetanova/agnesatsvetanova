package com.FuncionalProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ints = scanner.nextLine().split("\\s+");
        int[] array = Arrays.stream(ints).mapToInt(e -> Integer.parseInt(e)).toArray();

        OptionalInt min = Arrays.stream(array).min();

        int n = min.getAsInt();
        System.out.println(n);

    }
}