package com.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String first = line[0];
        String second = line[1];
        System.out.print(sum(first, second));

    }
    public static int sum (String firstWord, String secondWord){
        char[] one = firstWord.toCharArray();
        char[] two = secondWord.toCharArray();
        int min = Math.min(one.length, two.length);
        int max = Math.max(one.length, two.length);
        
        int sumAll = 0;
        for (int i = 0; i < min; i++) {
           sumAll += one[i] * two[i];
        }
        for (int i = min; i < max; i++) {
            if (one.length == max){
                sumAll += one[i];
            } else {
                sumAll += two[i];
            }
        }


        return sumAll;
    }
}
