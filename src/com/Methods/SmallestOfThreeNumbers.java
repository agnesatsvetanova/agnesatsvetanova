package com.Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printSmallest(first, second, third);
    }

    static void printSmallest(int first, int second, int third){
        int n = Math.min(first, second);
        System.out.print(Math.min(n, third));
    }
}
