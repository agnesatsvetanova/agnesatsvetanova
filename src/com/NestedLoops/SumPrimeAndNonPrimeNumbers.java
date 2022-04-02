package com.NestedLoops;

import java.util.Scanner;

public class SumPrimeAndNonPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime = 0;
        int nonPrime = 0;
        String num = null;

        do {
            num = scanner.nextLine();
            if(num.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(num);
            if (number < 0) {
                System.out.println("Number is negative");
            }
            boolean isNonPrime = false;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0){
                    nonPrime += number;
                    isNonPrime = true;
                    break;
                }
            }
            if (!isNonPrime){
                prime += number;
            }
        } while (!num.equals("stop"));
        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrime);
    }
}
