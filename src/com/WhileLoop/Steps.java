package com.WhileLoop;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;

        while (steps <= 10000) {
            String newSteps = scanner.nextLine();
            if (!"Going home".equals(newSteps)) {
                int notHome = Integer.parseInt(newSteps);
                steps += notHome;
            } else {
                int goHome = Integer.parseInt(scanner.nextLine());
                steps += goHome;
                break;
            }
        }
        if (steps >= 10000) {
            System.out.println("Goal reached! Good job");
            System.out.printf("%d over the goal.", steps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }

    }
}
