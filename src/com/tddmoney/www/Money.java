package com.tddmoney.www;

public abstract class Money {
    protected int ammount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return ammount == money.ammount && getClass().equals(money.getClass());
    }

    public static Money dollar(int ammount){
        return new Dollar(ammount);
    }

    public static Money franc(int ammount){
        return new Franc(ammount);
    }

    public abstract Money times(int multiplier);
}
