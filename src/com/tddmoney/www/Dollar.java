package com.tddmoney.www;

public class Dollar {

    public int ammount;

    public Dollar(int ammount){
        this.ammount = ammount;
    }

    public void times(int multiplier) {
        ammount *= multiplier;
    }
}
