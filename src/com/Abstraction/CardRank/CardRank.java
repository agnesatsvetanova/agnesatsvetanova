package com.Abstraction.CardRank;

enum CardRank {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    CardRank(int value) {
        this.value = value;
    }

    public int value;

    public static String getAllValues() {
        String res = "Card Ranks:\n";
        for (CardRank s : CardRank.values()) {
            res += "Ordinal value: " + s.value + "; Name value: " + s.name() + "\n";
        }
        return res.trim();
    }
}
