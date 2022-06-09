package com.FuncionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");
        Predicate<String> isEqual = name -> name.length() <= n;
        for (String name : names){
            if (isEqual.test(name)){
                System.out.println(name);
            }
        }
    }
}
