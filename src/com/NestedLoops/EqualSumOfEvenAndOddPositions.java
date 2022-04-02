package com.NestedLoops;

import java.util.Scanner;

public class EqualSumOfEvenAndOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= m; i++) {
            int odd = (i/100000) + ((i/1000)%10) + ((i/10)%10);
            int even = (i/10000)%10 + (i/100)%10 + (i%10);

            if (even == odd){
                System.out.println(i);
            }
        }
    }
}
