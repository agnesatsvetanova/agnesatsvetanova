package com.IfStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchBreak = breakDuration * 0.125;
        double relaxBreak = breakDuration * 0.25;
        double freeTime = breakDuration - lunchBreak - relaxBreak;

        if (freeTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, freeTime - episodeDuration);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, Math.ceil(episodeDuration - freeTime));
        }
    }
}
