package com.Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        countVowels(input);
    }
    public static void countVowels(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char n = input.charAt(i);
            if (n == 'A' || n == 'a' || n == 'E' || n == 'e' || n == 'I' || n == 'i' || n == 'O' || n == 'o' || n == 'U' || n == 'u'
               || n == 'Y' || n == 'y'){
               count++;
           }
        }
        System.out.print(count);
    }
}
