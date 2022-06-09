package com.FuncionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        List<Integer> nums = new ArrayList<>();
        boolean isDivisible = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i % numbers[j] != 0) {
                    isDivisible = false;
                }
            }
            if (isDivisible){
                nums.add(i);
            }
            isDivisible = true;
        }
        nums.forEach(number -> System.out.print(number + " "));

    }
}
