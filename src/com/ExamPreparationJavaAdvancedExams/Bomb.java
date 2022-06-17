package com.ExamPreparationJavaAdvancedExams;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");
        String[][] matrix = new String[n][n];
        String coordinates = "";
        int countBombs = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                String symbol = input[j];
                if (symbol.equals("s")) {
                    coordinates = i + " " + j;
                }
                if (symbol.equals("B")) {
                    countBombs++;
                }
                matrix[i][j] = symbol;
            }
        }
        String[] cords = coordinates.split(" ");
        int rowCoordinates = Integer.valueOf(cords[0]);
        int colCoordinates = Integer.valueOf(cords[1]);
        matrix[rowCoordinates][colCoordinates] = "+";
        int foundBombs = 0;
        boolean reachedEnd = false;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("up")) {
                if (rowCoordinates - 1 < 0) {
                } else if (matrix[rowCoordinates - 1][colCoordinates].equals("B")) {
                    System.out.println("You found a bomb!");
                    foundBombs++;
                    matrix[rowCoordinates - 1][colCoordinates] = "+";
                    rowCoordinates -= 1;
                } else if (matrix[rowCoordinates - 1][colCoordinates].equals("e")) {
                    reachedEnd = true;
                    break;
                } else if (matrix[rowCoordinates - 1][colCoordinates].equals("+")) {
                    rowCoordinates -= 1;
                }
            }
            if (commands[i].equals("down")) {
                if (rowCoordinates + 1 >= matrix.length) {
                } else if (matrix[rowCoordinates + 1][colCoordinates].equals("B")) {
                    System.out.println("You found a bomb!");
                    foundBombs++;
                    matrix[rowCoordinates + 1][colCoordinates] = "+";
                    rowCoordinates += 1;
                } else if (matrix[rowCoordinates + 1][colCoordinates].equals("e")) {
                    reachedEnd = true;
                    break;
                } else if (matrix[rowCoordinates + 1][colCoordinates].equals("+")) {
                    rowCoordinates += 1;
                }
            }
            if (commands[i].equals("right")) {
                if (colCoordinates + 1 >= matrix.length) {
                } else if (matrix[rowCoordinates][colCoordinates + 1].equals("B")) {
                    System.out.println("You found a bomb!");
                    foundBombs++;
                    matrix[rowCoordinates][colCoordinates + 1] = "+";
                    colCoordinates += 1;
                } else if (matrix[rowCoordinates][colCoordinates + 1].equals("e")) {
                    reachedEnd = true;
                    break;
                } else if (matrix[rowCoordinates][colCoordinates + 1].equals("+")) {
                    colCoordinates += 1;
                }
            }
            if (commands[i].equals("left")) {
                if (colCoordinates - 1 < 0) {

                } else if (matrix[rowCoordinates][colCoordinates - 1].equals("B")) {
                    System.out.println("You found a bomb!");
                    foundBombs++;
                    matrix[rowCoordinates][colCoordinates - 1] = "+";
                    colCoordinates -= 1;
                } else if (matrix[rowCoordinates][colCoordinates - 1].equals("e")) {
                    reachedEnd = true;
                    break;
                } else if (matrix[rowCoordinates][colCoordinates - 1].equals("+")) {
                    colCoordinates -= 1;
                }
            }
        }

        if (countBombs == foundBombs) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (reachedEnd) {
            System.out.printf("END! %d bombs left on the field", countBombs - foundBombs);
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", countBombs - foundBombs, rowCoordinates, colCoordinates);
        }
    }
}
