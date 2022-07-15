package com.Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String card = scanner.nextLine();
        CardPower cardPower = CardPower.valueOf(card);
        String suit = scanner.nextLine();
        SuitPower suitPower = SuitPower.valueOf(suit);

        System.out.printf("Card name: %s of %s; Card power: %d", card, suit, cardPower.getPower() + suitPower.getPowerSuit());

    }

}
