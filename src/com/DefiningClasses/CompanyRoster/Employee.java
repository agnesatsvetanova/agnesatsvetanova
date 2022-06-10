package com.DefiningClasses.CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    String position;
    String department;
    String email;
    int age;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this.email =  "n/a";
        this.age = -1;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.name + " " + String.format("%.2f",this.salary) + " " + this.email + " " + this.age;
    }
}
