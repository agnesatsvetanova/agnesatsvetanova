package com.Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int firstRes = findFactorial(first);
        int secondRes = findFactorial(second);
        double result = (1.0 * firstRes) / secondRes;
        System.out.printf("%.2f", result);
    }

    private static int findFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
