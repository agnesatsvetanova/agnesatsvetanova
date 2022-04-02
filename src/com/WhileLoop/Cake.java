package com.WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int wid = Integer.parseInt(scanner.nextLine());
        int cake = size * size;
        int piecesCount = 0;
        String command = scanner.nextLine();
        boolean isFinished = false;
        while (!command.equals("STOP") && cake != 0) {
            int pieces = Integer.parseInt(scanner.nextLine());
            piecesCount += pieces;
            cake -= piecesCount;
            isFinished = true;
            command = scanner.nextLine();
            }
        if (isFinished) {
            System.out.printf("%d pieces are left.", cake - piecesCount);
        }
        }
}
