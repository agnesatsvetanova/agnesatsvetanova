package com.IfStatements;

import java.util.Scanner;

public class SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record  = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double timeSwim = distance * time;
        double resistance = Math.floor(distance / 15) * 12.5;
        double totalTime = timeSwim + resistance;

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", (totalTime));
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - totalTime));
        }

    }
}
