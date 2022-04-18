package com.Maps;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> coursesAndStudents = new LinkedHashMap<>();
        while (!command.equals("end")){
            String[] line = command.split(" : ");
            String course = line[0];
            String student = line[1];
            List<String> students = new ArrayList<>();
            if (!coursesAndStudents.containsKey(course)){
                students.add(student);
                coursesAndStudents.put(course, students);
            } else {
                students = coursesAndStudents.get(course);
                students.add(student);
                coursesAndStudents.put(course, students);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> c : coursesAndStudents.entrySet()){
            System.out.println(c.getKey() + ": " + c.getValue().size());
            for (String s : c.getValue()) {
                System.out.println("-- " + s);
            }
        }
    }
}
