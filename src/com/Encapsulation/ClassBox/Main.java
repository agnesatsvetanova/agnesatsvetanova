package com.Encapsulation.ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);
        //Surface Area - 52.00
        //Lateral Surface Area - 40.00
        //Volume – 24.00
        double la = box.calculateLateralSurfaceArea();
        double sa = box.calculateSurfaceArea();
        double vol = box.calculateVolume();

        System.out.printf("Surface Area - %.2f\n", sa);
        System.out.printf("Lateral Surface Area - %.2f\n", la);
        System.out.printf("Volume - %.2f", vol);
    }
}
