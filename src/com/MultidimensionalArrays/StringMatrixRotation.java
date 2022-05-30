package com.MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int degree = Integer.parseInt(input.replace("Rotate(", "").replace(")", ""));
        String line = scanner.nextLine();
        String strings = "";

        while (!line.equals("END")) {
            strings += line + " ";
            line = scanner.nextLine();
        }

        String[] split = strings.split(" ");

        int biggest = 0;

        List<String> convert = new ArrayList<>();
        for (String s : split) {
            if (s.length() > biggest) {
                biggest = s.length();
            }
        }

        for (int i = 0; i < split.length; i++) {
            String spaced = split[i];
            if (split[i].length() < biggest) {
                int countSpace = biggest - split[i].length();
                for (int j = 0; j < countSpace; j++) {
                    spaced += " ";
                }
                convert.add(spaced);
            } else {
                convert.add(spaced);
            }
        }

        char[][] chars = new char[convert.size()][biggest];
        for (int i = 0; i < convert.size(); i++) {
            chars[i]= convert.get(i).toCharArray();
        }

        if (degree > 360){
            degree = degree % 360;
        }

        if (degree == 90){
            for (int i = 0; i < biggest; i++) {
                for (int j = convert.size() - 1; j >= 0; j--) {
                    System.out.print(chars[j][i]);
                }
                System.out.println();
            }
        }

        if (degree == 180){
            for (int i = convert.size() - 1; i >= 0; i--) {
                for (int j = biggest - 1; j >= 0; j--) {
                    System.out.print(chars[i][j]);
                }
                System.out.println();
            }
        }

        if (degree == 270){
            for (int i = biggest - 1; i >= 0; i--) {
                for (int j = 0; j < convert.size(); j++) {
                    System.out.print(chars[j][i]);
                }
                System.out.println();
            }
        }

        if (degree == 360 || degree == 0) {
            for (int i = 0; i < convert.size(); i++) {
                for (int j = 0; j < biggest; j++) {
                    System.out.print(chars[i][j]);
                }
                System.out.println();
            }
        }
    }
}
