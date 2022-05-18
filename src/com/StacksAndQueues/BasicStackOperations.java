package com.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(values[0]);
        int s = Integer.parseInt(values[1]);
        int x = Integer.parseInt(values[2]);
        String valuesTwo = scanner.nextLine();
        List<Integer> numbersTwo = Arrays.stream(valuesTwo.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0 ; i < n; i++) {
            stack.push(numbersTwo.get(i));
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (!stack.isEmpty()) {
            int smallest = stack.peek();
            while(!stack.isEmpty()) {
                Integer popped = stack.pop();
                if (x == popped) {
                    System.out.println("true");
                    return;
                } else {
                    if (smallest > popped) {
                        smallest = popped;
                    }
                }
            }
            System.out.println(smallest);
        } else {
            System.out.println(0);
        }
    }
}
