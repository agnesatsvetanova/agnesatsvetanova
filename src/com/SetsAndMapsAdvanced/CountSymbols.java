package com.SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> occurrences = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
           Character symbol = text.charAt(i);
           int count = 1;
           if (!occurrences.containsKey(symbol)){
               occurrences.put(symbol, count);
           } else {
               occurrences.put(symbol, occurrences.get(symbol) + count );
           }
        }

        for (Map.Entry<Character, Integer> symbol : occurrences.entrySet()){
            System.out.println(symbol.getKey() + ": " + symbol.getValue() + " time/s");
        }
    }
}
