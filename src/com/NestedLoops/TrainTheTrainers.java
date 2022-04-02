package com.NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double all = 0;
        int allCount = 0;
        while (!presentation.equals("Finish")){
            double sumGrades = 0;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
            }
            presentation = scanner.nextLine();
            double average = sumGrades / jury;
            System.out.printf("%s - %.2f.\n", presentation, average);

            all += average;
            allCount ++;
        }
        System.out.printf("assessment - %.2f.\n", all * 1.0d / allCount);
    }
}
