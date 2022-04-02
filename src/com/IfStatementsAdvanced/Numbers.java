package com.IfStatementsAdvanced;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double sum = 0;
        String typeNum = "";

        if (symbol.equals("+")) {
            sum = n1 + n2;
            if (sum % 2 == 0) {
                typeNum = "even";
            } else {
                typeNum = "odd";
            }
            System.out.printf("%d %s %d = %.0f – %s", n1, symbol, n2, sum, typeNum);
        } else if (symbol.equals("-")) {
            sum = n1 - n2;
            if (sum % 2 == 0) {
                typeNum = "even";
            } else {
                typeNum = "odd";
            }
            System.out.printf("%d %s %d = %.0f – %s", n1, symbol, n2, sum, typeNum);

        } else if (symbol.equals("*")) {
            sum = n1 * n2;
            if (sum % 2 == 0) {
                typeNum = "even";
            } else {
                typeNum = "odd";
            }
            System.out.printf("%d %s %d = %.0f – %s", n1, symbol, n2, sum, typeNum);

        } else if (symbol.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                sum = n1 / n2;
                System.out.printf("%d %s %d = %.2f – %s", n1, symbol, n2, sum, typeNum);
            }
        } else if (symbol.equals("%")) {
            sum = n1 % n2;
            System.out.printf("%d %s %d = %.0f", n1, symbol, n2, sum);
        }
    }
}
