package com.IfStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double full = rows * columns;
        double income = 0;
        switch (movie) {
            case "Premiere":
                income = full * 12.00;
                break;
            case "Normal":
                income = full * 7.50;
                break;
            case "Discount":
                income = full * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);

    }
}
