package com.TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] text = line.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            char symbol = (char) (text[i] + 3);
            sb.append(symbol);
        }
        System.out.println(sb);
    }
}
