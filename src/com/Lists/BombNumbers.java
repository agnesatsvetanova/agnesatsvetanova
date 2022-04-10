package com.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String secondLine = scanner.nextLine();
        int[] bombAndCount = Arrays.stream(secondLine.split(" ")).mapToInt(Integer::parseInt).toArray();
        int bomb = bombAndCount[0];
        int count = bombAndCount[1];

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bomb){
                for (int j = 0; j < count*2 +1; j++) {
                    if(i-count < numbers.size() && !numbers.isEmpty()) {
                        numbers.remove(Math.max(i - count, 0));
                    }
                }
                i=Math.max(i - count, 0);
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.print(sum);

    }
}
