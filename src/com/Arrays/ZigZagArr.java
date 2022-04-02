package com.Arrays;

import java.util.Scanner;

public class ZigZagArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] type = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                arr1[i] = Integer.valueOf(type[0]);
                arr2[i] = Integer.valueOf(type[1]);
            } else {
                arr1[i] = Integer.valueOf(type[1]);
                arr2[i] = Integer.valueOf(type[0]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(i != arr1.length-1) {
                System.out.print(arr1[i]+ " ");
            } else {
                System.out.println(arr1[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(i != arr2.length-1) {
                System.out.print(arr2[i]+ " ");
            } else {
                System.out.println(arr2[i]);
            }
        }
    }
}
