package com.ObjectsAndClasses;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> sorted = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] ar = line.split("\\s+");
            Student student = new Student(ar[0], ar[1], Double.parseDouble(ar[2]));
            sorted.add(student);
        }
        sorted.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Object s : sorted){
            System.out.println(s);
        }
    }
    public static class Student{
        String firstName;
        String lastName;
        Double grade;

        public Student(String firstName, String lastName, Double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Double getGrade() {
            return grade;
        }

        public void setGrade(Double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ": " + String.format("%.2f",grade);
        }
    }
}
