package com.ExamPreparationJavaAdvancedLab;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        String coordinates = "";
        for (int i = 0; i < n; i++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                char symbol = input[j];
                if (symbol == 'M') {
                    coordinates = i + " " + j;
                }
                matrix[i][j] = symbol;
            }
        }
        String[] cords = coordinates.split(" ");
        int rowCoordinates = Integer.valueOf(cords[0]);
        int colCoordinates = Integer.valueOf(cords[1]);
        matrix[rowCoordinates][colCoordinates] = '-';
        int countCheese = 0;
        String command = scanner.nextLine();
        boolean oob = false;
        while (!command.equals("end")) {
            switch (command) {
                case "down":
                    if (rowCoordinates + 1 >= matrix.length) {
                        matrix[rowCoordinates][colCoordinates] = '-';
                        oob = true;
                        break;
                    } else if (matrix[rowCoordinates + 1][colCoordinates] == 'c') {
                        matrix[rowCoordinates + 1][colCoordinates] = '-';
                        rowCoordinates += 1;
                        countCheese++;
                    } else if (matrix[rowCoordinates + 1][colCoordinates] == 'B') {
                        matrix[rowCoordinates + 1][colCoordinates] = '-';
                        if (rowCoordinates + 2 >= matrix.length) {
                            matrix[rowCoordinates+1][colCoordinates] = '-';
                            oob = true;
                            break;
                        } else if (matrix[rowCoordinates + 2][colCoordinates] == 'c') {
                            matrix[rowCoordinates + 2][colCoordinates] = '-';
                            countCheese++;
                        }
                        rowCoordinates += 2;
                    } else if (matrix[rowCoordinates + 1][colCoordinates] == '-') {
                        rowCoordinates++;
                    }
                    break;
                case "right":
                    if (colCoordinates + 1 >= matrix.length) {
                        matrix[rowCoordinates][colCoordinates] = '-';
                        oob = true;
                        break;
                    } else if (matrix[rowCoordinates][colCoordinates + 1] == 'c') {
                        matrix[rowCoordinates][colCoordinates + 1] = '-';
                        colCoordinates += 1;
                        countCheese++;
                    } else if (matrix[rowCoordinates][colCoordinates + 1] == 'B') {
                        matrix[rowCoordinates][colCoordinates + 1] = '-';
                        if (colCoordinates + 2 >= matrix.length) {
                            matrix[rowCoordinates][colCoordinates+1] = '-';
                            oob = true;
                            break;
                        } else if (matrix[rowCoordinates][colCoordinates + 2] == 'c') {
                            matrix[rowCoordinates][colCoordinates + 2] = '-';
                            countCheese++;
                        }
                        colCoordinates += 2;
                    } else if (matrix[rowCoordinates][colCoordinates + 1] == '-') {
                        colCoordinates++;
                    }
                    break;
                case "up":
                    if (rowCoordinates - 1 < 0) {
                        matrix[rowCoordinates][colCoordinates] = '-';
                        oob = true;
                        break;
                    } else if (matrix[rowCoordinates - 1][colCoordinates] == 'c') {
                        matrix[rowCoordinates - 1][colCoordinates] = '-';
                        rowCoordinates -= 1;
                        countCheese++;
                    } else if (matrix[rowCoordinates - 1][colCoordinates] == 'B') {
                        matrix[rowCoordinates - 1][colCoordinates] = '-';
                        if (rowCoordinates - 2 < 0) {
                            matrix[rowCoordinates - 1][colCoordinates] = '-';
                            oob = true;
                            break;
                        } else if (matrix[rowCoordinates - 2][colCoordinates] == 'c') {
                            matrix[rowCoordinates - 2][colCoordinates] = '-';
                            countCheese++;
                        }
                        rowCoordinates -= 2;
                    } else if (matrix[rowCoordinates - 1][colCoordinates] == '-'){
                        rowCoordinates--;
                    }
                    break;
                case "left":
                    if (colCoordinates - 1 < 0) {
                        matrix[rowCoordinates][colCoordinates] = '-';
                        oob = true;
                        break;
                    } else if (matrix[rowCoordinates][colCoordinates - 1] == 'c') {
                        matrix[rowCoordinates][colCoordinates - 1] = '-';
                        colCoordinates -= 1;
                        countCheese++;
                    } else if (matrix[rowCoordinates][colCoordinates - 1] == 'B') {
                        matrix[rowCoordinates][colCoordinates - 1] = '-';
                        if (colCoordinates - 2 < 0) {
                            matrix[rowCoordinates][colCoordinates - 1] = '-';
                            oob = true;
                            break;
                        } else if (matrix[rowCoordinates][colCoordinates - 2] == 'c') {
                            matrix[rowCoordinates][colCoordinates - 2] = '-';
                            countCheese++;
                        }
                        rowCoordinates -= 2;
                    } else if (matrix[rowCoordinates][colCoordinates - 1] == '-'){
                        colCoordinates--;
                    }
                    break;
            }
            if(!oob) {
                command = scanner.nextLine();
            } else {
                break;
            }
        }
        if(!oob) {
            matrix[rowCoordinates][colCoordinates] = 'M';
        } else {
            System.out.println("Where is the mouse?");
        }
        if (countCheese < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.\n", 5 - countCheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!\n", countCheese);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
