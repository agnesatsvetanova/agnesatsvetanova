package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] items = input.split(" ");
        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = 0 ; j < i ; j++) {
                leftSide += arr[j];
            }
            for (int k = i + 1; k < arr.length ; k++) {
                rightSide += arr[k];
            }
            if (leftSide == rightSide){
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("no");
        }
    }
}
