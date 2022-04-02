package com.IntermediateExam;

import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nBuiscits = Integer.parseInt(scanner.nextLine());
        int nWorkers = Integer.parseInt(scanner.nextLine());
        int competitorCount = Integer.parseInt(scanner.nextLine());

        int sumOfBuiscits = 0;
        for(int i=1;i<=30;i++){
            if(i%3==0) {
                sumOfBuiscits += (nBuiscits * nWorkers) * 0.75;
            } else {
                sumOfBuiscits += nBuiscits * nWorkers;
            }
        }
        System.out.println("You have produced " + sumOfBuiscits + " biscuits for the past month.");

        if(sumOfBuiscits > competitorCount) {
            System.out.printf("You produce %.2f percent more biscuits.", 1.0d * (sumOfBuiscits-competitorCount) / competitorCount * 100);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", 1.0d * (competitorCount-sumOfBuiscits) / competitorCount  * 100);
        }
    }
}
