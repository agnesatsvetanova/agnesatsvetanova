package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringArr = input.split(" ");
        int[] arr = Arrays.stream(stringArr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[i] + arr[j]){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
