package com.TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] seq = line.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < seq.length; i++) {
            int additionalI = 0;
            if (Character.isDigit(seq[i])) {
                int explosion = Character.getNumericValue(seq[i]);
                for (int j = i+1; j < i+explosion; j++) {
                    char el = seq[j];
                    if (el == '>') {
                        sb.append('>');
                        explosion++;
                    } else if(Character.isDigit(el)) {
                        explosion += Character.getNumericValue(el);
                    }
                    additionalI++;
                    continue;
                }
                i+= additionalI;
            } else {
                sb.append(seq[i]);
            }
        }
        System.out.println(sb.toString());

    }
}
