package com.FirstSteps;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yearTax = Double.parseDouble(scan.nextLine());

        double shoes = yearTax - (yearTax * 40 / 100);
        double clothes = shoes - (shoes * 20 / 100);
        double ball = clothes * 25 / 100;
        double accessories = ball * 20 / 100;
        double price = yearTax + shoes + clothes + ball + accessories;
        System.out.println(price);
    }
}
