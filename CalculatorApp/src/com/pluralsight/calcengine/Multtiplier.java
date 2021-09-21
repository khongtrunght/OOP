package com.pluralsight.calcengine;

public class Multtiplier extends CalculateBase{
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
