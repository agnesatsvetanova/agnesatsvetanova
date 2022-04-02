package com.IfStatements;

import java.util.Scanner;

public class TimeAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int futureTime = minutes + 15;

        if (futureTime > 59 && hour <=23 ) {
            futureTime = futureTime - 60;
            hour ++;
        } else if (hour > 23) {
            hour = hour - 24;
        }

        System.out.printf("%d:%d", hour, futureTime);

    }
}
