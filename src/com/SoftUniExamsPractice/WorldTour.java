package com.SoftUniExamsPractice;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialStops = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            if (command.startsWith("Add")) {
                String replaced = command.replace("Add Stop:", "");
                String[] split = replaced.split(":");
                int index = Integer.parseInt(split[0]);
                if (index >= 0 && index < initialStops.length()){
                    String destination = split[1];
                    initialStops = initialStops.substring(0, index) + destination + initialStops.substring(index);
                }
            } else if (command.startsWith("Remove")) {
                String replaced = command.replace("Remove Stop:", "");
                String[] split = replaced.split(":");
                int startIndex = Integer.parseInt(split[0]);
                int endIndex = Integer.parseInt(split[1]);
                if (startIndex >= 0 && endIndex >= 0 &&
                        startIndex < initialStops.length() &&
                        endIndex < initialStops.length()){
                    initialStops = initialStops.substring(0, startIndex) + initialStops.substring(endIndex + 1);
                }
            } else if (command.startsWith("Switch")) {
                String replaced = command.replace("Switch:", "");
                String[] split = replaced.split(":");
                String destToReplace = split[0];
                String newDest = split[1];
                initialStops = initialStops.replace(destToReplace, newDest);
            }
            System.out.println(initialStops);
            command = scanner.nextLine();
        }
        System.out.print("Ready for world tour! Planned stops: " + initialStops);
    }
}
