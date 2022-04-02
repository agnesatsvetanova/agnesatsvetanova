package com.ForLoops;

import java.util.Scanner;

public class TrackingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0;
        double musala = 0;
        double montblanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        int countPeople = 0;
        for (int i = 0; i < groups; i++) {
            countPeople = Integer.parseInt(scanner.nextLine());
            sumPeople = sumPeople + countPeople;

            if (countPeople <= 5) {
               musala = musala + countPeople;
            } else if (countPeople <= 12) {
                montblanc = montblanc + countPeople;
            } else if (countPeople <= 25) {
                kilimanjaro = kilimanjaro + countPeople;
            } else if (countPeople <= 40) {
                k2 = k2 + countPeople;
            } else if (countPeople >= 41) {
                everest = everest + countPeople;
            }
        }
        musala = musala / sumPeople * 100;
        montblanc = montblanc / sumPeople * 100;
        kilimanjaro = kilimanjaro / sumPeople * 100;
        k2 = k2 / sumPeople * 100;
        everest = everest / sumPeople *100;

        System.out.printf("%.2f%%%n", musala);
        System.out.printf("%.2f%%%n", montblanc);
        System.out.printf("%.2f%%%n", kilimanjaro);
        System.out.printf("%.2f%%%n", k2);
        System.out.printf("%.2f%%", everest);
    }
}
