package com.shashi.git;

public class CalculatorImpl_V1 implements Calculator {

    @Override
    public Integer sum(Number number1, Number number2) {
        return (Integer) number1 + (Integer) number2;
    }

    @Override
    public Integer difference(Number number1, Number number2) {
        return (Integer) number1 - (Integer) number2;
    }

    @Override
    public Integer product(Number number1, Number number2) {
        return (Integer) number1 * (Integer) number2;
    }

    @Override
    public Integer division(Number number1, Number number2) {
        return ((Integer) number2 == 0) ? 0 : ((Integer) number1 / (Integer) number2);
    }
}
