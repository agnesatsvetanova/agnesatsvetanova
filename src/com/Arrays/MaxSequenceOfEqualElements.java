package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();
        int countFound = 1;
        int indexMax = arr[0];
        int countMax = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]){
                countFound ++;
            } else {
                countFound = 1;
            }
            if(countFound > countMax) {
                countMax = countFound;
                indexMax = i+1;
            }
        }
        for (int i = indexMax - countMax + 1; i <= indexMax; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
