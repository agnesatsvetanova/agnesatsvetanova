package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isBigger = true;
            int iE = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int jE = arr[j];
                if (iE < jE) {
                    isBigger = false;
                    break;
                }
            }
            if(isBigger) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}