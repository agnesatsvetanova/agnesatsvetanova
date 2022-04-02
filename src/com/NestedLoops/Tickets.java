package com.NestedLoops;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int seats = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        double totalTickets = 0;

        while (!movie.equals("Finish") && !type.equals("Finish")) {
            String currMovie = movie;
            int moviePPLCount = 0;
            while (!type.equals("End") && !type.equals("Finish")) {
                if (type.equals("student")) {
                    student++;
                    moviePPLCount++;
                } else if (type.equals("standard")) {
                    standard++;
                    moviePPLCount++;
                } else if (type.equals("kid")) {
                    kid++;
                    moviePPLCount++;
                }
                type = scanner.nextLine();
            }
            double percentCurrMovie = (1.0d*moviePPLCount / seats) * 100;
            System.out.printf("%s - %.2f%% full.\n", currMovie, percentCurrMovie);
            totalTickets += moviePPLCount;
            if(type.equals("Finish")) {
                break;
            }
            movie = scanner.nextLine();
            seats = Integer.parseInt(scanner.nextLine());
            type = scanner.nextLine();
        }
        double percentStudent = (student / totalTickets) * 100;
        double percentStandard = (standard / totalTickets) * 100;
        double percentKid = (kid / totalTickets) * 100;

        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", percentStudent);
        System.out.printf("%.2f%% standard tickets.\n", percentStandard);
        System.out.printf("%.2f%% kid tickets.\n", percentKid);
    }
}
