package com.ForLoops;

import java.util.Scanner;

public class TennisRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int sumPoints = 0;
        int pointsW = 0;
        int pointsF = 0;
        int pointsSf = 0;
        for (int i = 0; i < tournaments; i++) {
            String round = scanner.nextLine();
            if (round.equals("W")) {
                pointsW ++;
                sumPoints = sumPoints + 2000;
            } else if (round.equals("F")) {
                pointsF++;
                sumPoints = sumPoints + 1200;
            } else if (round.equals("SF")) {
                pointsSf++;
                sumPoints = sumPoints + 720;
            }
        }
        int allPoints = initialPoints + sumPoints;
        int allTournamentsPoints = pointsW * 2000 + pointsF * 1200 + pointsSf * 720;
        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %.0f%n",allTournamentsPoints / tournaments);
        double percents = pointsW / tournaments * 100;
        System.out.printf("%.2f%%", percents);
    }
}
