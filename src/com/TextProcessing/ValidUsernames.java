package com.TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> passwords = Arrays.stream(line.split(", ")).collect(Collectors.toList());

        for (String user : passwords){
            if (isValid(user)){
                System.out.println(user);
            }
        }
    }

    private static boolean isValid(String password) {
        if (password.length() < 3 || password.length() > 16) {
            return false;
        }
        for (int j = 0; j < password.length(); j++) {
            char symbol = password.charAt(j);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
