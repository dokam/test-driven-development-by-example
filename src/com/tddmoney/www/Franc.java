package com.tddmoney.www;

import java.util.Currency;

public class Franc extends Money {

    private String currency;

    public Franc(int ammount, String currency){

        this.ammount = ammount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Franc(ammount * multiplier, currency);
    }


}
