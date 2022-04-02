package com.ForLoops;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        int pointsAcademy = Integer.parseInt(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());
        double sumPoints = pointsAcademy;
        for (int i = 0; i < countJury; i++) {
            String jury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());
            sumPoints = sumPoints + (pointsJury * jury.length() / 2);
        }
        if (sumPoints>1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.2f!", actor, sumPoints);
        } else {
            System.out.printf("Sorry, %s you need %.2f more!", actor, 1250.5 - sumPoints);
        }
    }
}
