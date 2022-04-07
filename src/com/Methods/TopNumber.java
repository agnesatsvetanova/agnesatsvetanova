package com.Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= line ; i++) {
            if (getSumOfDigits(i) && checkIfHasOdd(i)){
                System.out.println(i);
            }
        }

    }

    private static boolean checkIfHasOdd(int n) {
        boolean isOdd = false;
        while (n != 0){
            int digit = n % 10;
            if (digit % 2 != 0){
                isOdd = true;
            }
            n /= 10;
        }
        return isOdd;
    }

    private static boolean getSumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n%10;
            n = n / 10;
        }
        boolean isDivisible = false;
        if (sum % 8 == 0){
            isDivisible = true;
        }
        return isDivisible;
    }
}
