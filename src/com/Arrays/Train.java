package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] wagons = new int[n];
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = scanner.nextInt();
        }
        for (int i = 0; i < wagons.length; i++) {
            sum += wagons[i];
            if(i != wagons.length-1) {
                System.out.print(wagons[i]+ " ");
            } else {
                System.out.println(wagons[i]);
            }
        }
        System.out.println(sum);
    }
}
