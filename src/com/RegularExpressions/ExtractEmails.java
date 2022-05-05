package com.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String pattern = "[\\w]+(?:\\.|-|_)?[\\w]+@([\\w]+(?:-)?(\\.[\\w]+(?:-)?)+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(line);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
