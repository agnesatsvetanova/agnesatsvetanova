package com.TextProcessing;

import java.util.*;

public class LettersChangeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        double singleSum = 0;
        double totalSum = 0;

        for (int i = 0; i < line.length; i++) {
            String letter = line[i];
            char[] let = letter.toCharArray();
            List<String> letters = new ArrayList<>();
            letters.add(String.valueOf(let[0]));
            String n = "";
            String l = "";
            for (int j = 1; j < let.length; j++) {
                if (Character.isLetter(let[j])) {
                    l += let[j];
                } else {
                    n += String.valueOf(let[j]);
                }
            }
            letters.add(n);
            letters.add(l);
            String first = letters.get(0);
            Double number = Double.parseDouble(letters.get(1));
            String last = letters.get(2);

            if (Character.isUpperCase(first.charAt(0))){
                int before = first.charAt(0) - 'A' + 1;
                singleSum = number / before;
            } else if (Character.isLowerCase(first.charAt(0))){
                int before = first.charAt(0) - 'a' + 1;
                singleSum = number * before;
            }
            if (Character.isUpperCase(last.charAt(0))){
                int after = last.charAt(0) - 'A' + 1;
                singleSum -= after;
            } else if (Character.isLowerCase(last.charAt(0))){
                int after = last.charAt(0) - 'a' + 1;
                singleSum += after;
            }

            totalSum += singleSum;
            singleSum = 0;
        }
        System.out.printf("%.2f", totalSum);
    }
}
