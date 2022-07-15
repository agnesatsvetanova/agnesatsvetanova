package com.Abstraction.TrafficLights;

import com.Abstraction.TrafficLights.TrafficLights;

import java.util.Scanner;

import static com.Abstraction.TrafficLights.TrafficLights.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lights = scanner.nextLine().split(" ");
        TrafficLights[] trafficLights = new TrafficLights[lights.length];
        for (int i = 0; i < lights.length; i++) {
            trafficLights[i] = TrafficLights.valueOf(lights[i]);
        }
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < trafficLights.length; j++) {
                if (trafficLights[j].equals(RED)) {
                    trafficLights[j] = GREEN;
                    System.out.print(GREEN + " ");
                } else if (trafficLights[j].equals(GREEN)) {
                    System.out.print(YELLOW + " ");
                    trafficLights[j] = YELLOW;
                } else {
                    System.out.print(RED + " ");
                    trafficLights[j] = RED;
                }
            }
            System.out.println();
        }
    }
}
