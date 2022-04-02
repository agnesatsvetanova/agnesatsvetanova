package com.IfStatementsAdvanced;

import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        System.out.printf("It's %d degrees.%n", degrees);
        if (degrees >= 10 && degrees <= 18) {
            if (time.equals("Morning")) {
                System.out.println("Get your sweatshirt and sneakers.");
            } else if (time.equals("Afternoon")) {
                System.out.println("Get your shirt and moccasins.");
            } else if (time.equals("Evening")) {
                System.out.println("Get your shirt and moccasins.");
            }
        } else if (degrees >= 18 && degrees <= 24) {
            if (time.equals("Morning")) {
                System.out.println("Get your shirt and moccasins.");
            } else if (time.equals("Afternoon")) {
                System.out.println("Get your t-shirt and sandals.");
            } else if (time.equals("Evening")) {
                System.out.println("Get your shirt and moccasins.");
            }
        }else{
            if (time.equals("Morning")) {
                System.out.println("Get your t-shirt and sandals.");
            } else if (time.equals("Afternoon")) {
                System.out.println("Get your swimsuit and barefoot.");
            } else if (time.equals("Evening")) {
                System.out.println("Get your shirt and moccasins.");
            }
        }
    }
}
