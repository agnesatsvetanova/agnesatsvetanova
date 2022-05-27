package com.MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][columns];
        char start = 97;
        char middle = 97;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                String palindrome = Character.toString(start) + Character.toString(middle) + Character.toString(start);
                matrix[r][c] = palindrome;
                middle++;
            }
            start++;
            middle = start;
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
