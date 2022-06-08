package com.FuncionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> isNotDivisible = number -> number % n != 0;
        List<Integer> nums = numbers.stream().filter(isNotDivisible).collect(Collectors.toList());
        Collections.reverse(nums);
        for (Integer i : nums){
            System.out.print(i + " ");
        }
    }
}
