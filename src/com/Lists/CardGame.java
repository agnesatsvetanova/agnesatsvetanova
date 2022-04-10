package com.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valuesOne = scanner.nextLine();
        String valuesTwo = scanner.nextLine();
        List<Integer> firstPlayersCards = Arrays.stream(valuesOne.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayersCards = Arrays.stream(valuesTwo.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (!firstPlayersCards.isEmpty() && !secondPlayersCards.isEmpty()) {
            if (firstPlayersCards.get(0) > secondPlayersCards.get(0)) {
                firstPlayersCards.add(firstPlayersCards.get(0));
                firstPlayersCards.add(secondPlayersCards.get(0));
                firstPlayersCards.remove(0);
                secondPlayersCards.remove(0);
            } else if (firstPlayersCards.get(0) < secondPlayersCards.get(0)) {
                secondPlayersCards.add( secondPlayersCards.get(0));
                secondPlayersCards.add(firstPlayersCards.get(0));
                secondPlayersCards.remove(0);
                firstPlayersCards.remove(0);
            } else {
                firstPlayersCards.remove(0);
                secondPlayersCards.remove(0);
            }

        }
        int sum = 0;
        if (!firstPlayersCards.isEmpty()){
            for ( Integer fistPlayersCard : firstPlayersCards){
                    sum += fistPlayersCard;
            }
        } else {
            for ( Integer secondPlayersCard : secondPlayersCards){
                sum += secondPlayersCard;
            }
        }
        System.out.println(sum);
    }
}
