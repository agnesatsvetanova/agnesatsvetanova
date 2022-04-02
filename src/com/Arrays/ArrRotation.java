package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr = scanner.nextLine();
        String[] ints = arr.split(" ");
        int[] array = Arrays.stream(ints).mapToInt(e -> Integer.parseInt(e)).toArray();

        int rotations = Integer.parseInt(scanner.nextLine())%array.length;

        for (int i = rotations; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < rotations; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
