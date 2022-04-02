package com.softuniada;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ar[][] = new int[26][26];
        for(int i=0;i<26;i++) {
            for (int j = 0; j < 26; j++) {
                ar[i][j] = 0;
            }
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<n;i++) {
            String l = scanner.nextLine();
            char f = l.charAt(0);
            char s = l.charAt(2);
            ar[(int)f-'A'][(int)s-'A'] = 1;
            ar[(int)s-'A'][(int)f-'A'] = 1;
        }
        for(int i=0;i<26;i++) {
            for(int j=0;j<26;j++) {
                if(ar[i][j] == 1) {
                    System.out.println((char) (i + 'A') + "<->" + (char)(j+'A'));
                }
            }
        }
    }
}
