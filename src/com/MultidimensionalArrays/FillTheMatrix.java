package com.MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int length = Integer.parseInt(input[0]);
        String method = input[1];
        if (method.equals("A")) {
            methodA(length);
        } else {
            methodB(length);
        }
    }

    static void methodA(int length) {
        int[][] matrix = new int[length][length];
        for (int rows = 0; rows < length; rows++) {
            int counter = 0;
            for (int cols = 0; cols < length; cols++) {
                matrix[rows][cols] = rows + 1 + counter;
                counter += length;
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    static void methodB(int length) {
        int[][] matrix = new int[length][length];
        int n = 1;

        for (int cols = 0; cols < length; cols++) {
            if (cols % 2 == 0){
                for (int rows = 0; rows < length; rows++) {
                    matrix[rows][cols] = n;
                    n++;
                }
            } else{
                for (int rows = length-1; rows >= 0 ; rows--) {
                    matrix[rows][cols] = n;
                    n++;
                }
            }
        }
        for (int cols = 0; cols < length; cols++) {
            for (int rows = 0; rows < length; rows++) {
                System.out.print(matrix[cols][rows] + " ");
            }
            System.out.println();
        }
    }
}
