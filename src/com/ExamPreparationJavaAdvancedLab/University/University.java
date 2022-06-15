package com.ExamPreparationJavaAdvancedLab.University;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        String res = "";
        if (this.capacity > this.students.size()) {
            this.students.add(student);
            res = "Added student " + student.getFirstName() + " " + student.getLastName();
        } else if (this.students.contains(student)) {
            res = "Student is already in the university";
        } else if (this.capacity <= this.students.size()) {
            res = "No seats in the university";
        }
        return res;
    }

    public String dismissStudent(Student student) {
        if(this.students.contains(student)) {
            this.students.remove(student);
            String removed = student.getFirstName() + " " + student.getLastName();
            return removed;
        } else {
            return "Student not found";
        }
    }

    public Student getStudent(String firstName, String lastName) {
        for(Student s : students) {
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return s;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : this.students) {
            stringBuilder.append("==Student: First Name = " + student.getFirstName() + ", Last Name = " + student.getLastName() + ", Best Subject = " + student.getBestSubject()+"\n");
        }
        return stringBuilder.toString();
    }
}
