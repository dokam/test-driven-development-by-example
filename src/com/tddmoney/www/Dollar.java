package com.tddmoney.www;

public class Dollar extends Money {

    public Dollar(int ammount){
        this.ammount = ammount;
    }

    public Money times(int multiplier) {
        return new Dollar(ammount * multiplier);
    }


}
