package com.IntermediateExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String [] cars = text.split(">>");
        List<String> results = new ArrayList<>();
        int allTaxes = 0;
        for(int i=0;i<cars.length;i++) {
            String[] carInfo = cars[i].split(" ");
            String carType = carInfo[0];
            int year = Integer.valueOf(carInfo[1]);
            int km = Integer.valueOf(carInfo[2]);
            int curTax = 0;
            if(carType.equals("family")) {
                curTax += 50;
                curTax -= 5*year;
                curTax += 12 * (km / 3000);
            } else if(carType.equals("heavyDuty")) {
                curTax += 80;
                curTax -= 8*year;
                curTax += 14 * (km / 9000);
            } else if(carType.equals("sports")) {
                curTax += 100;
                curTax -= 9*year;
                curTax += 18 * (km / 2000);
            } else {
                results.add("Invalid car type.");
                continue;
            }
            results.add("A " + carType + " car will pay " + curTax + ".00 euros in taxes.");
            allTaxes += curTax;
        }
        for(String r : results) {
            System.out.println(r);
        }
        System.out.println("The National Revenue Agency will collect " + allTaxes +".00 euros in taxes.");
    }

}
