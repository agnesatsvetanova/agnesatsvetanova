package com.Abstraction.CardsWithPower;
 enum SuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    public int powerSuit;

    SuitPower(int power) {
        this.powerSuit = power;
    }

    public int getPowerSuit() {
        return powerSuit;
    }
}
