package com.SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> one = new LinkedHashSet<>();
        Set<Integer> two = new LinkedHashSet<>();
        List<Integer> repeated = new LinkedList<>();

        for (int i = 0; i < size[0]; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            one.add(element);
        }

        for (int i = 0; i < size[1]; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            two.add(element);
        }

        for (Integer el : one) {
            for (Integer el2 : two){
                if (el == el2) {
                    System.out.print(el + " ");
                }
            }
        }
    }
}
