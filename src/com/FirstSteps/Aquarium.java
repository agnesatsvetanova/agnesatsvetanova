package com.FirstSteps;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double length = Double.parseDouble(s.nextLine());
        double width = Double.parseDouble(s.nextLine());
        double height = Double.parseDouble(s.nextLine());
        double percent = Double.parseDouble(s.nextLine());

        double volumeAquarium = length * width * height;
        double volumeInLitres = volumeAquarium / 1000;
        double space = percent /100;
        double neededLiters =  volumeInLitres * (1 - space);
        System.out.println(neededLiters);
    }
}
