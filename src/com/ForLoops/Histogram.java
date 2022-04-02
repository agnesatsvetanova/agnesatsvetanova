package com.ForLoops;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 399) {
                p2++;
            } else if (number < 599) {
                p3++;
            } else if (number < 799) {
                p4++;
            } else {
                p5++;
            }
        }
        if (p1 == 0) {
            System.out.println("0.00%");
        } else {
            double p1Percent = 1.0 * p1 / n * 100;
            System.out.printf("%.2f%%%n", p1Percent);
        }

        if (p2 == 0) {
            System.out.println("0.00%");
        } else {
            double p2Percent = 1.0 * p2 / n * 100;
            System.out.printf("%.2f%%%n", p2Percent);
        }

        if (p3 == 0) {
            System.out.println("0.00%");
        } else {
            double p3Percent = 1.0 * p3 / n * 100;
            System.out.printf("%.2f%%%n", p3Percent);
        }

        if (p4 == 0) {
            System.out.println("0.00%");
        } else {
            double p4Percent = 1.0 * p4 / n * 100;
            System.out.printf("%.2f%%%n", p4Percent);
        }

        if (p5 == 0) {
            System.out.println("0.00%");
        } else {
            double p5Percent = 1.0 * p5 / n * 100;
            System.out.printf("%.2f%%%n", p5Percent);
        }
    }
}
