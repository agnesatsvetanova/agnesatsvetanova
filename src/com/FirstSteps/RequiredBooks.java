package com.FirstSteps;

import java.util.Scanner;

public class RequiredBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int neededHours = numberPages / pagesPerHour;
        int neededHoursPerDay = neededHours / days;
        System.out.println(neededHoursPerDay);


    }
}
