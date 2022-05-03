package com.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String pattern = ">>(?<Product>[A-Za-z]+)<<(?<Price>\\d+\\.?\\d+)!(?<Quantity>\\d+).*";
        List<String> furniture = new ArrayList<>();
        double totalMoney = 0;
        while (!line.equals("Purchase")) {
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(line);
            if (matcher.matches()) {
                String product = matcher.group("Product");
                String pri = matcher.group("Price");
                String qua = matcher.group("Quantity");
                double price = Double.parseDouble(pri);
                int quantity = Integer.parseInt(qua);
                double totalSum = price * quantity;
                totalMoney += totalSum;
                furniture.add(product);
            }
            line = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String f : furniture) {
            System.out.println(f);
        }
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
