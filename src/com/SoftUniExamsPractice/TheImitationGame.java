package com.SoftUniExamsPractice;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")){
            if (command.startsWith("Move|")){
                int nLetters = Integer.parseInt(command.replace("Move|", ""));
                //Moves the first n letters to the back of the string
                message = message.substring(nLetters, message.length()) + message.substring(0, nLetters);

            } else if (command.startsWith("Insert|")){
                String[] split = command.replace("Insert|", "").split("\\|");
                int index = Integer.parseInt(split[0]);
                String value = split[1];
                //Inserts the given value before the given index in the string
                message = message.substring(0, index) + value + message.substring(index, message.length());

            } else if (command.startsWith("ChangeAll|")){
                String[] split = command.replace("ChangeAll|", "").split("\\|");
                String substring = split[0];
                String replacement = split[1];
                message = message.replace(substring, replacement);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
