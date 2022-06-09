package com.FuncionalProgramming;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> smallestIndex = integerList -> {
            int n = integerList.get(0);
            int smallestI = 0;
            for (int i = 1; i < integerList.size(); i++) {
                if (integerList.get(i) <= n){
                    n = integerList.get(i);
                    smallestI = i;
                }
            }
            return smallestI;
        };
        System.out.println(smallestIndex.apply(numbers));
    }
}
