package com.Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineOne = scanner.nextLine().split("=|;");
        Map<String, Person> people = new LinkedHashMap<>();
        for (int i = 0; i < lineOne.length; i += 2) {
            Person person = new Person(lineOne[i], Double.parseDouble(lineOne[i + 1]));
            people.put(lineOne[i], person);
        }

        String[] lineOTwo = scanner.nextLine().split("=|;");
        Map<String, Product> products = new LinkedHashMap<>();
        for (int i = 0; i < lineOTwo.length; i += 2) {
            Product product = new Product(lineOTwo[i], Double.parseDouble(lineOTwo[i + 1]));
            products.put(lineOTwo[i], product);
        }

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split(" ");
            String person = tokens[0];
            String product = tokens[1];
            people.get(person).buyProduct(products.get(product));

            line = scanner.nextLine();
        }
        for (Map.Entry<String, Person> person : people.entrySet()) {
            List<Product> prod = person.getValue().getProducts();
            if (prod.isEmpty()) {
                System.out.println(person.getKey() + " – Nothing bought");
                continue;
            } else {
                System.out.print(person.getKey() + " - ");
            }
            String r = "";
            for (Product pr : prod) {
                r+=pr.getName() + ", ";
            }
            System.out.println(r.trim().substring(0, r.length() - 2));
            System.out.println();
        }
    }
}

