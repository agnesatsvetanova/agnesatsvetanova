package com.FirstSteps;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double neededNylon = (nylon + 2) * 1.50;
        double neededPaint = (paint + (1.0 * paint * 10 / 100)) * 14.50;
        double neededThinner = thinner * 5.00;
        double bags = 0.40;
        double sumMaterials = neededNylon + neededPaint + neededThinner + bags;
        double sumWorkman = (1.0 * sumMaterials * 30 / 100) * hours;
        double sum = sumMaterials + sumWorkman;
        System.out.println(sum);

    }
}
