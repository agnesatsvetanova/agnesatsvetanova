package com.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfOperations; i++) {
            String command = scanner.nextLine();
            if(!stack.isEmpty()) {
                sb = new StringBuilder(stack.peek());
            }
            if (command.startsWith("1")){
                sb = sb.append(command.replace("1 ", ""));
                stack.push(sb.toString());
            } else if (command.startsWith("2")){
                int popped = Integer.parseInt(command.replace("2 ", ""));
                sb = sb.delete(sb.length() - popped, sb.length());
                stack.push(sb.toString());
            } else if (command.startsWith("3")){
                int index = Integer.parseInt(command.replace("3 ", "")) - 1 ;
                System.out.println(sb.toString().charAt(index));
            } else {
                stack.pop();
            }
        }
    }
}
