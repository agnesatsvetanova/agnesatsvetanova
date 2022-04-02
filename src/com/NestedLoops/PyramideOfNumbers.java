package com.NestedLoops;

import java.util.Scanner;

public class PyramideOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int newLine = 1;
        int newLinePrinted = 1;
        for(int i=1;i<=n;i++) {
            System.out.print(i + " ");
            if(newLinePrinted==newLine) {
                newLinePrinted = 0;
                newLine+=1;
                System.out.println();
            }
            newLinePrinted++;
        }
    }
}
