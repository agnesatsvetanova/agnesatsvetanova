package com.SoftUniExamsPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")){
            if (command.startsWith("InsertSpace")){
                int index = Integer.parseInt(command.replace("InsertSpace:|:", ""));
                message = message.substring(0, index) + " " + message.substring(index , message.length());
                System.out.println(message);
            } else if (command.startsWith("Reverse")){
                String substring = command.replace("Reverse:|:", "");
                if (message.contains(substring)){
                    message = message.replaceFirst(Pattern.quote(substring), "");
                    StringBuilder sb = new StringBuilder("");
                    for (int i = substring.length() - 1; i >= 0; i--) {
                        sb.append(substring.charAt(i));
                    }
                    message = message + sb.toString();
                    System.out.println(message);
                } else {
                    System.out.println("error");
                }
            } else if (command.startsWith("ChangeAll")){
                String[] split = command.replace("ChangeAll:|:", "").split(":\\|:");
                String substring = split[0];
                String replacement = split[1];
                message = message.replace(substring, replacement);
                System.out.println(message);
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
