package com.StacksAndQueues;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getFibonacci(n));
    }
    static Map<Integer, BigInteger> cache = new HashMap<>();
    private static BigInteger getFibonacci (int n) {
        if (n == 0){
            return BigInteger.ONE;
        }else if (n == 1){
            return BigInteger.ONE;
        } else {
            if(cache.containsKey(n)) {
                return cache.get(n);
            }
            cache.put(n, getFibonacci(n - 1 ).add(getFibonacci(n - 2)));
            return cache.get(n);
        }
    }
}
