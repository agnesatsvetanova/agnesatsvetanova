package com.StacksAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        List<Integer> lineTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < Integer.parseInt(line[0]); i++) {
            queue.offer(lineTwo.get(i));
        }

        for (int i = 0; i < Integer.parseInt(line[1]); i++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println(0);
            return;
        }

        int smallest = queue.peek();
        int target = Integer.parseInt(line[2]);
        while (!queue.isEmpty()){
            int polled = queue.poll();
            if (target == smallest){
                System.out.println("true");
                return;
            } else if (smallest > polled){
                smallest = polled;
            }
        }
        System.out.println(smallest);
    }
}