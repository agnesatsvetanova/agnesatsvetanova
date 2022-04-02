package com.IfStatements;

import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int sum = first + second + third;
        int totalMinutes = sum / 60;
        int totalSeconds = sum % 60;

        if (totalSeconds < 10) {
            System.out.printf("%d : 0%d", totalMinutes, totalSeconds);
        } else {
            System.out.printf("%d : %d, totalMinutes, totalSeconds");
        }
    }
}
