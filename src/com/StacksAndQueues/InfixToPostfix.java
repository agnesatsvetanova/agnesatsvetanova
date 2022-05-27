package com.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();


        for (int i = 0; i < input.length; i++) {
            String symbol = input[i];
            if (symbol.equals("(") || symbol.equals(")")) {
                continue;
            } else {
                if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
                    stack.push(symbol);
                } else {
                    queue.offer(symbol);
                }
            }

        }
        for (String q : queue) {
            System.out.print(q + " ");
        }

        for (String s : stack) {
            System.out.print(s + " ");
        }
    }
}
