package com.MultidimensionalArrays;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        int height = Integer.parseInt(size[0]);
        int length = Integer.parseInt(size[1]);
        String[][] matrix = new String[height][length];

        for (int i = 0; i < height; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < length; j++) {
                matrix[i][j] = input[j];
            }
        }
        String[] line = scanner.nextLine().split(" ");
        String swap = "";

        while (!line[0].equals("END")){
            if (line.length == 5 && line[0].equals("swap") && Integer.parseInt(line[1]) <= height && Integer.parseInt(line[2]) <= length
            && Integer.parseInt(line[3]) <= length && Integer.parseInt(line[4]) <= length) {
                swap = matrix[Integer.parseInt(line[3])][Integer.parseInt(line[4])];
                matrix[Integer.parseInt(line[3])][Integer.parseInt(line[4])] = matrix[Integer.parseInt(line[1])][Integer.parseInt(line[2])];
                matrix[Integer.parseInt(line[1])][Integer.parseInt(line[2])] = swap;
                for (int r = 0; r < height; r++) {
                    for (int c = 0; c < length; c++) {
                        System.out.print(matrix[r][c] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input!");
            }
            line = scanner.nextLine().split(" ");
            swap = "";
        }
    }
}
