package com.MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < size; i++) {
            sumD1 += matrix[i][i];
            sumD2 += matrix[i][size - 1 - i];
        }

        int diff = Math.abs(sumD1 - sumD2);
        System.out.println(diff);
    }
}