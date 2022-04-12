package com.Lists;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("\\s+", " ").trim();
        input = input.replace("| ", "|");
        input = input.replace(" |", "|");
        String[] arrays = input.split("\\|");
        for(int i=arrays.length - 1;i>=0;i--) {
            String[] curArray = arrays[i].split(" ");
            for(String elem : curArray) {
                System.out.print(elem + " ");
            }
        }
    }
}
