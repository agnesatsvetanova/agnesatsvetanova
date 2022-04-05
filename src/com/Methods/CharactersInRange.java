package com.Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);

        getPrintInRange(first, second);
    }

    private static void getPrintInRange(char first, char second) {
        int firstI = Math.min((int)first, (int)second);
        int lastI = Math.max((int)first, (int)second);;
        for (int i = firstI + 1; i <= lastI - 1 ; i++) {
            String convertedChar = Character.toString(i);
            System.out.print(convertedChar + " ");
        }
    }
}
