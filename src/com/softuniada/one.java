package com.softuniada;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = nod(a,b) + nok(a,b);

        System.out.println(sum);
    }

    public static int nod(int a,int b) {
        if(b==0) return a;
        return nod(b,a%b);
    }

    public static int nok(int a,int b) {
        int start = Math.max(a,b);
        for(int i=start;i<=a*b;i++) {
            if(i%a == 0 && i%b == 0) {
                return i;
            }
        }
        return a;
    }
}
