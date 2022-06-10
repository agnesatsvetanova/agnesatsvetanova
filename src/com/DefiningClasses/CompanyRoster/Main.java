package com.DefiningClasses.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> departments = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String[] line = scanner.nextLine().split(" ");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String dep = line[3];
            if (line.length < 6) {
                if (line.length == 4) {
                    Employee employee = new Employee(name, salary, position, dep, "n/a", -1);
                    if (!departments.containsKey(dep)) {
                        List<Employee> employees = new ArrayList<>();
                        employees.add(employee);
                        departments.put(dep, employees);
                    } else {
                        List<Employee> employees = departments.get(dep);
                        employees.add(employee);
                        departments.put(dep, employees);
                    }
                } else {
                    if (Character.isLetter(line[4].charAt(0))) {
                        String email = (line[4]);
                        Employee employee = new Employee(name, salary, position, dep, email, -1);
                        if (!departments.containsKey(dep)) {
                            List<Employee> employees = new ArrayList<>();
                            employees.add(employee);
                            departments.put(dep, employees);
                        } else {
                            List<Employee> employees = departments.get(dep);
                            employees.add(employee);
                            departments.put(dep, employees);
                        }
                    } else {
                        int age = Integer.parseInt(line[4]);
                        Employee employee = new Employee(name, salary, position, dep, "n/a", age);
                        if (!departments.containsKey(dep)) {
                            List<Employee> employees = new ArrayList<>();
                            employees.add(employee);
                            departments.put(dep, employees);
                        } else {
                            List<Employee> employees = departments.get(dep);
                            employees.add(employee);
                            departments.put(dep, employees);
                        }
                    }
                }
            } else {
                String email = line[4];
                int age = Integer.parseInt(line[5]);
                Employee employee = new Employee(name, salary, position, dep, email, age);
                if (!departments.containsKey(dep)) {
                    List<Employee> employees = new ArrayList<>();
                    employees.add(employee);
                    departments.put(dep, employees);
                } else {
                    List<Employee> employees = departments.get(dep);
                    employees.add(employee);
                    departments.put(dep, employees);
                }
            }
        }
        double maxA = 0d;
        String maxD = null;
        for (Map.Entry<String, List<Employee>> entry : departments.entrySet()){
            List<Employee> employeeList = entry.getValue();
            double curSum = 0d;
            for (Employee employee : employeeList) {
                curSum += employee.getSalary();
            }
            double average = curSum / employeeList.size();
            if(average > maxA) {
                maxA = average;
                maxD = entry.getKey();
            }
        }
        System.out.println("Highest Average Salary: " + maxD);
        List<Employee> employees = departments.get(maxD);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o2, Employee o1) {
                if (o1.getSalary() < o2.getSalary()) return -1;
                if (o1.getSalary() > o2.getSalary()) return 1;
                return 0;
            }
        });
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
