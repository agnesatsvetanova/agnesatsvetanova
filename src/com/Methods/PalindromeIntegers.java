package com.Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("END")){

            if (checkIfPalindrome(line) == true){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            line = scanner.nextLine();
        }

    }

    private static boolean checkIfPalindrome(String n) {
        String firstPart = "";
        String secondPart = "";
        boolean check = false;
        for (int i = 0; i < n.length() / 2; i++) {
            firstPart = firstPart + n.charAt(i);
        }
        int mid = n.length() / 2;
        if(n.length() % 2 == 1) {
            mid++;
        }
        for (int i = n.length(); i > mid; i--) {
            secondPart = secondPart + n.charAt(i-1);
        }
        if (firstPart.equals(secondPart)){
            check = true;
        }
        return check;
    }
}
