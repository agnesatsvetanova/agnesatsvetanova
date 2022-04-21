package com.TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            number.add(Integer.valueOf(Character.getNumericValue(symbol)));
        }

        String  sum = "";
        int reminder = 0;
        for (int i = number.size() - 1 ; i >= 0; i--) {
            if (i == 0){
                int finalN = number.get(i) * n + reminder;
                sum += finalN % 10;
                sum += finalN / 10;
            } else {
                sum += ((number.get(i) * n) % 10) + reminder;
                reminder = (number.get(i) * n) / 10;
            }
        }
        System.out.println(new StringBuilder(sum).reverse().toString());
    }
}
