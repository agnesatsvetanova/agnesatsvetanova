package com.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {
            if (stack.isEmpty() || brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{'){
                stack.push(brackets.charAt(i));
                continue;
            }
            int peek = stack.peek();
            if ((peek == '(' && brackets.charAt(i) == ')') ||
                    (peek == '[' && brackets.charAt(i) == ']') ||
                    (peek == '{' && brackets.charAt(i) == '}')){
                stack.pop();
            } else {
                stack.push(brackets.charAt(i));
            }
        }

        if (stack.isEmpty()){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
