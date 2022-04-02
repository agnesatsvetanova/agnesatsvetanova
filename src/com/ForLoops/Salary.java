package com.ForLoops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = scanner.nextInt();
        int salary = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <tabs; i++) {
            String socialNetwork = scanner.nextLine();
            if (socialNetwork.equals("Facebook")){
                salary = salary - 150;
            } else if (socialNetwork.equals("Instagram")){
                salary = salary - 100;
            } else if (socialNetwork.equals("Reddit")){
                salary = salary - 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary");
                break;
            }
        }
        if (salary>0){
            System.out.println(salary);
        }
    }
}
