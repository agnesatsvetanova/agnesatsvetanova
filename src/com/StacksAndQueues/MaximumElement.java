package com.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("1")) {
                String split[] = command.split("\\s+");
                int pushed = Integer.parseInt(split[1]);
                stack.push(pushed);

            } else if (command.startsWith("2")) {
                stack.pop();
            } else {
                ArrayDeque<Integer> stackNew = new ArrayDeque<>();
                stackNew.addAll(stack);
                int max = stackNew.peek();
                while (!stackNew.isEmpty()) {
                    Integer popped = stackNew.pop();
                    if (max < popped) {
                        max = popped;
                    }
                }
                System.out.println(max);
            }
        }
    }
}

