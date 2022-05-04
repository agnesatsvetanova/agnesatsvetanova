package com.RegularExpressions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String pattern = "%(?<Customer>[A-Z][a-z]+)%[^(\\|\\$\\.\\d)]*<(?<Product>\\w+)>[^(\\|\\$\\.\\d)]*\\|(?<Quantity>\\d+)\\|[^(\\|\\$\\.\\d)]*(?<Price>\\d+\\.?\\d+)\\$";
        double totalMoney = 0;
        while (!input.equals("end of shift")) {
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(input);
            if (matcher.matches()) {
                String client = matcher.group("Customer");
                String productName = matcher.group("Product");
                int quantity = Integer.parseInt(matcher.group("Quantity"));
                double price = Double.parseDouble(matcher.group("Price"));
                double sum = quantity * price;
                totalMoney += sum;

                System.out.printf("%s: %s - %.2f%n", client, productName, sum);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalMoney);
    }
}
