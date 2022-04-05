package com.FundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<n;i++) {
            String line = scanner.nextLine();
            String pattern = "\\|([A-Z]{4,})\\|:\\#([A-Za-zs]{1,}\\s[A-Za-zs]{1,})\\#";
            // Create a Pattern object
            Pattern r = Pattern.compile(pattern);
            // Now create matcher object.
            Matcher m = r.matcher(line);
            if(m.matches()) {
                System.out.println(m.group(1) + ", The " + m.group(2));
                System.out.println(">> Strength: " + m.group(1).length());
                System.out.println(">> Armor: " + m.group(2).length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
