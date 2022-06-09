package com.FuncionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0){
                return - 1;
            } else if (n1 % 2 != 0 && n2 % 2 == 0){
                return 1;
            }else {
                return n1.compareTo(n2);
            }
        };

        Arrays.sort(numbers, comparator);
       /* Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0 && o2 % 2 == 0) ||(o1 % 2 == 1 && o2 % 2 == 1)){
                    return o1 - o2;
                }
                if (o1 % 2 == 0 && Math.abs(o2) % 2 == 1){
                    return -1;
                }
                if (Math.abs(o1) % 2 == 1 && o2 % 2 == 0){
                    return 1;
                }
                return 0;
            }
        });*/

        for (Integer n : numbers){
            System.out.print(n + " ");
        }
    }
}
