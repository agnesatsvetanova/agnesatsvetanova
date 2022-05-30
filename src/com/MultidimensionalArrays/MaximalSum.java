package com.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        int height = Integer.parseInt(size[0]);
        int length = Integer.parseInt(size[1]);
        int[][] matrix = new int[height][length];

        for (int i = 0; i < height; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        int sum = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        int bestR = 0;
        int bestC = 0;

        for (int r = 0; r < height - 2; r++) {
            for (int c = 0; c < length - 2; c++) {
                curr = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2]
                        + matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];


                if (curr > sum) {
                    sum = curr;
                    bestR = r;
                    bestC = c;
                }
            }
        }

        System.out.println("Sum = " + sum);
        for (int i = bestR; i < bestR + 3; i++) {
            for (int j = bestC; j < bestC + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}