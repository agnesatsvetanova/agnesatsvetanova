package com.softuniada;

import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int t = scanner.nextInt();
            values.add(t);
        }
        Collections.sort(values);
        int newn = n%2==0 ? n : n-1;
        for(int i=0;i<newn;i+=2) {
            System.out.print(values.get(i+1));
            System.out.print(" " + values.get(i));
            if(i!= newn-2) {
                System.out.print(" ");
            }
        }
        if(newn != n) {
            System.out.print(" " + values.get(n-1));
        }
    }
}
