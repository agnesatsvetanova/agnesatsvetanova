package com.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        char[] seq = line.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < seq.length - 1; i++) {
            char symbol = seq[i];
            if (symbol != seq[i + 1]){
                sb.append(symbol);
            }
            if (i == seq.length - 2){
                sb.append(seq[i + 1]);
            }
        }
        System.out.println(sb);
    }
}
