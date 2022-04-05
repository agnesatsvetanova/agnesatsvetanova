package com.FundamentalsFinalExam;

import java.util.Locale;
import java.util.Scanner;

public class ExOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Done")) {
            if(command.startsWith("Change")) {
                char first = command.charAt(7);
                char second = command.charAt(9);
                line = line.replace(first,second);
                System.out.println(line);
            } else if(command.startsWith("Includes")) {
                String includes = command.substring(8);
                if(line.contains(includes)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if(command.startsWith("End")) {
                String includes = command.substring(3);
                if(line.endsWith(includes)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if(command.equals("Uppercase")) {
                line = line.toUpperCase(Locale.ROOT);
                System.out.println(line);
            } else if(command.startsWith("FindIndex")) {
                char c = command.charAt(10);
                System.out.println(line.indexOf(c));
            } else if(command.startsWith("Cut")) {
                int s = Character.getNumericValue(command.charAt(4));
                int e = s +  Character.getNumericValue((command.charAt(6)));
                line = line.substring(s,e);
                System.out.println(line);
            }
            command = scanner.nextLine();
        }
    }
}
