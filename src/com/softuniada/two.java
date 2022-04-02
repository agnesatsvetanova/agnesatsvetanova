package com.softuniada;

import java.util.Locale;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        name = name.toUpperCase(Locale.ROOT);
        for(int i=0;i<a;i++) {
            for(int j=0;j<a;j++) {
                System.out.print(" ");
            }
            System.out.print("~ ~ ~");
            System.out.println();
        }
        for(int i=0;i<a*3 +5;i++) {
            System.out.print("=");
        }
        System.out.println();

        for(int i=0;i<a-2;i++) {
            if((a%2==0 && i+1== a/2) || (a%2 == 1 && i+1 == a/2)) {
                System.out.print("|");
                int len = 2*a+4 - name.length();
                for(int l = 0;l<len/2;l++) {
                    System.out.print("~");
                }
                System.out.print(name);
                for(int l = 0;l<len/2;l++) {
                    System.out.print("~");
                }
                System.out.print("|");
                for(int k=0;k<a-1;k++) {
                    System.out.print(" ");
                }
                System.out.println("|");
                continue;
            }
            System.out.print("|");
            for(int j=0;j<2*a+4;j++){
                System.out.print("~");
            }
            System.out.print("|");
            for(int k=0;k<a-1;k++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for(int i=0;i<a*3 +5;i++) {
            System.out.print("=");
        }
        System.out.println();
        int br=-1;
        int end = 2*a+6;
        for(int i=0;i<a;i++){
            br++;
            end-=1;
            for(int j=0;j<end;j++){
                if(j<br) {
                    System.out.print(" ");
                }else if(j==br){
                    System.out.print("\\");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println("/");
        }
        for(int i=0;i<a*3 +5;i++) {
            System.out.print("-");
        }
    }
}
