package com.Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        boolean correctLength = checkCharactersLength(pass);
        boolean correctType = checkDigitOrLetter(pass);
        boolean correctDigits = countDigits(pass);
        boolean valid = true;
        if (correctLength == false){
            System.out.println("Password must be between 6 and 10 characters");
            valid = false;
        }
        if (correctType == false){
            System.out.println("Password must consist only of letters and digits");
            valid = false;
        }
        if (correctDigits == false){
            System.out.println("Password must have at least 2 digits");
            valid = false;
        }
        if(valid == true){
            System.out.println("Password is valid");
        }
    }

    private static boolean countDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))){
                count++;
            }
        }
        if (count >= 2){
            return true;
        }
        return false;
    }

    private static boolean checkDigitOrLetter(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i)) || Character.isAlphabetic(pass.charAt(i))){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCharactersLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10){
            return true;
        }
        return false;
    }

}
