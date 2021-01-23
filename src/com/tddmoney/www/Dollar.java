package com.tddmoney.www;

public class Dollar extends Money {

    private String currency;

    public Dollar(int ammount, String currency){

        this.ammount = ammount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Dollar(ammount * multiplier,currency);
    }


}
