package com.Maps;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>>students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)){
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(name, grades);
            } else {
                List<Double> grades = students.get(name);
                grades.add(grade);
                students.put(name, grades);
            }
        }
        for (Map.Entry<String, List<Double>> s : students.entrySet()){
            double sum = 0d;
            for (int i = 0; i < s.getValue().size(); i++) {
                sum += s.getValue().get(i);
            }
            if (sum / s.getValue().size() >= 4.50){
                System.out.printf("%s -> %.2f%n", s.getKey(), sum / s.getValue().size());
            }
        }
    }
}
