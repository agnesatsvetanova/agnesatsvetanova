package com.Abstraction.CardSuits;

enum CardSuit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    public int value;

    CardSuit(int value) {
        this.value =value;
    }

    public static String getAllValues() {
        String res = "Card Suits:\n";
        for(CardSuit s : CardSuit.values()) {
            res += "Ordinal value: " + s.value + "; Name value: " + s.name() + "\n";
        }
        return res.trim();
    }
}
