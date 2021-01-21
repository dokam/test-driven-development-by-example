package com.tddmoney.www;

public class Franc extends Money {

    public Franc(int ammount){
        this.ammount = ammount;
    }

    public Money times(int multiplier) {
        return new Franc(ammount * multiplier);
    }


}
