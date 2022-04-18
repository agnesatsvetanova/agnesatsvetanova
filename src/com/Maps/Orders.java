package com.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, PriceAndQuantity> stock = new LinkedHashMap<>();

        while (!line.equals("Buy")) {
            String[] split = line.split("\\s+");
            String product = split[0];
            double price = Double.parseDouble(split[1]);
            int quantity = Integer.parseInt(split[2]);
            PriceAndQuantity priceAndQuantity = new PriceAndQuantity(price, quantity);
            if (!stock.containsKey(product)) {
                stock.put(product, priceAndQuantity);
            } else {
                if (priceAndQuantity.getPrice() != price) {
                    priceAndQuantity.setPrice(price);
                }
                priceAndQuantity.setQuantity(stock.get(product).getQuantity() + priceAndQuantity.getQuantity());
                stock.put(product, priceAndQuantity);
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, PriceAndQuantity> entry : stock.entrySet()) {
            double money = entry.getValue().getQuantity() * entry.getValue().getPrice();
           // PriceAndQuantity p = (PriceAndQuantity)entry.getValue();
            System.out.printf("%s -> %.2f%n", entry.getKey(), money);
        }
    }

    static class PriceAndQuantity {
        private double price;
        private int quantity;

        public PriceAndQuantity(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

}
