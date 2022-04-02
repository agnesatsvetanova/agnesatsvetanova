package com.FirstSteps;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double chickenMenu = Double.parseDouble(scan.nextLine());
        double fishMenu = Double.parseDouble(scan.nextLine());
        double vegetarianMenu = Double.parseDouble(scan.nextLine());

        double neededChicken = chickenMenu * 10.35;
        double neededFish = fishMenu * 12.40;
        double neededVegetarian = vegetarianMenu * 8.15;
        double price = neededChicken + neededFish + neededVegetarian;
        double dessert = price * 20 / 100;
        double delivery = 2.50;
        double neededPrice = price + dessert + delivery;
        System.out.println(neededPrice);
    }
}
