package com.tddmoney.www;

public interface Expression {
    /*Money reduce(String to);*/

    Money reduce(Bank bank, String to);

    Expression plus(Expression tenFrancs);

    Expression times(int multiplier);
}
