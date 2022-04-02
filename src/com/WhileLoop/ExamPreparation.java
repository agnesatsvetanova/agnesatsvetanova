package com.WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBadGrades = Integer.parseInt(scanner.nextLine());
        double grades = 0;
        int countGrades = 0;
        String taskTemp = "";
        int badGrades = 0;
        String task = "";
        while (badGrades != countBadGrades){
           taskTemp = scanner.nextLine();
           if(taskTemp.equals("Enough")) {
               break;
           }
           int grade = Integer.parseInt(scanner.nextLine());
           if(grade <= 4) {
               badGrades++;
           }
           grades = grades + grade;
           countGrades++;

           if(!"Enough".equals(taskTemp)) {
               task = taskTemp;
           }
        }
        double average = grades / countGrades;
        if (taskTemp.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countGrades);
            System.out.printf("%s", task);
        } else if(badGrades == countBadGrades) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        }
    }
}
