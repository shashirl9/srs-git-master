package com.shashi.git;

public class CalculatorImpl_V2 implements Calculator {

    @Override
    public Long sum(Number number1, Number number2) {
        return (Long) number1 + (Long) number2;
    }

    @Override
    public Long difference(Number number1, Number number2) {
        return (Long) number1 - (Long) number2;
    }

    @Override
    public Long product(Number number1, Number number2) {
        return (Long) number1 * (Long) number2;
    }

    @Override
    public Long division(Number number1, Number number2) {
        return ((Long) number2 == 0) ? 0 : ((Long) number1 / (Long) number2);
    }
}
