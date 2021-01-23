package com.tddmoney.www;

public abstract class Money {
    protected int ammount;

    public abstract String currency();

    public boolean equals(Object object){
        Money money = (Money) object;
        return ammount == money.ammount && currency().equals(money.currency());
    }

    public static Money dollar(int ammount, String currency){
        return new Dollar(ammount,currency);
    }

    public static Money franc(int ammount, String currency){
        return new Franc(ammount,currency);
    }

    public abstract Money times(int multiplier);


}
