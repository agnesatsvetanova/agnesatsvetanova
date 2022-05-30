package com.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mdSize = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = mdSize[0];
        int cols = mdSize[1];
        int[][] md = new int[rows][cols];
        int element = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                md[r][c] = element;
                element++;
            }
        }

        String line = scanner.nextLine();

        while (!line.equals("Nuke it from orbit")) {
            String[] split = line.split(" ");
            int rIndex = Integer.parseInt(split[0]);
            int cIndex = Integer.parseInt(split[1]);
            int explosionRadius = Integer.parseInt(split[2]);

            int start = 1;
            for (int i = 0; i < explosionRadius; i++) {
                if(rIndex >= 0 && cIndex >=0 && rIndex< rows && cIndex < cols) {
                    md[rIndex][cIndex] = 0;
                }
                if (rIndex - start >= 0 && cIndex >= 0 && cIndex < cols) {
                    md[rIndex - start][cIndex] = 0;
                }
                if (rIndex + start < rows && cIndex >= 0 && cIndex < cols) {
                    md[rIndex + start][cIndex] = 0;
                }
                if (cIndex - start >= 0 && rIndex >= 0 && rIndex < cols) {
                    md[rIndex][cIndex - start] = 0;
                }
                if (cIndex + start < cols && rIndex >= 0 && rIndex < cols) {
                    md[rIndex][cIndex + start] = 0;
                }
                start++;
            }

            int[][] mdt = new int[rows][cols];
            for (int it = 0; it < rows; it++) {
                int jbr = 0;
                for (int jt = 0; jt < cols; jt++) {
                    if (md[it][jt] != 0) {
                        mdt[it][jbr] = md[it][jt];
                        jbr++;
                    }
                }
            }
            md = mdt;
            line = scanner.nextLine();
        }

        for (int it = 0; it < rows; it++) {
            for (int jt = 0; jt < cols; jt++) {
                if (md[it][jt] != 0) {
                    System.out.print(md[it][jt] + " ");
                }
            }
            System.out.println();
        }
    }
}
