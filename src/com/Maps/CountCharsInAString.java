package com.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                continue;
            }
            if (!map.containsKey(line.charAt(i))) {
                map.put(line.charAt(i), 1);
            } else {
                map.put(line.charAt(i), map.get(line.charAt(i))+ 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
