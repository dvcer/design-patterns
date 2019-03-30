package ru.mukhin.absfactory;

public class BigSizesFactory implements AbstractFactory{
    @Override
    public String getCircle() {
        return "BigCircle";
    }

    @Override
    public String getSquare() {
        return "BiqSquare";
    }
}
