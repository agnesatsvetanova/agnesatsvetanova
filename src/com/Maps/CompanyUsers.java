package com.Maps;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while (!command.equals("End")){
            String[] line = command.split(" -> ");
            String company = line[0];
            String employee = line[1];
            List<String> employees = new ArrayList<>();
            if (!companyEmployees.containsKey(company)){
                employees.add(employee);
                companyEmployees.put(company, employees);
            } else {
                employees = companyEmployees.get(company);
                employees.add(employee);
                companyEmployees.put(company, employees);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> c : companyEmployees.entrySet()){
            System.out.println(c.getKey() + ": ");
            for (String s : c.getValue()) {
                System.out.println("-- " + s);
            }
        }
    }
}
