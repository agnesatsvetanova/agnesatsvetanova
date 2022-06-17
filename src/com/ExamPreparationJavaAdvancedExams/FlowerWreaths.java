package com.ExamPreparationJavaAdvancedExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stackLilies = new ArrayDeque<>();
        ArrayDeque<Integer> queRoses = new ArrayDeque<>();

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(", ");
        int[] lilies = Arrays.stream(items).mapToInt(Integer::parseInt).toArray();
        for (int lily : lilies) {
            stackLilies.push(lily);
        }

        String inputLine2 = scanner.nextLine();
        String[] items2 = inputLine2.split(", ");
        int[] roses = Arrays.stream(items2).mapToInt(Integer::parseInt).toArray();
        for (int rose : roses) {
            queRoses.offer(rose);
        }

        int countWreaths = 0;
        int countFlowersLeft = 0;

        while (!stackLilies.isEmpty() && !queRoses.isEmpty()){
            if (queRoses.peek() + stackLilies.peek() == 15){
                countWreaths++;
                queRoses.poll();
                stackLilies.pop();
            } else if (queRoses.peek() + stackLilies.peek() > 15) {
                int popped = stackLilies.pop();
                int polled = queRoses.poll();
                while (popped + polled > 15) {
                    popped -= 2;
                    //countFlowersLeft += 2;
                    if (popped + polled == 15){
                        countWreaths++;
                        break;
                    } else if (popped + polled < 15) {
                        countFlowersLeft += popped + polled;
                        break;
                    }

                }
            } else if (queRoses.peek() + stackLilies.peek() < 15) {
                countFlowersLeft += queRoses.peek() + stackLilies.peek();
                queRoses.poll();
                stackLilies.pop();
            }
        }

        int leftFlowers = countFlowersLeft / 15;
        if (leftFlowers >= 1) {
            countWreaths += leftFlowers;
        }

        if (countWreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", countWreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - countWreaths );
        }
    }
}
