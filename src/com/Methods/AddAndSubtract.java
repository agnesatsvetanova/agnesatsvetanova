package com.Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        int result = subtract(add(one, two), three);
        System.out.print(result);
    }

    private static int subtract(int sum, int three) {
        return sum - three;
    }

    private static int add(int one, int two) {
        return one + two;
    }
}
