package com.FirstSteps;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RadianConvector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radian = Double.parseDouble(scanner.nextLine());
        double degrees = radian * 180 / Math.PI;
        System.out.println(degrees);
    }
}
