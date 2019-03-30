package ru.mukhin.absfactory;

public class SmallSizesFactory implements AbstractFactory{
    @Override
    public String getCircle() {
        return "SmallCircle";
    }

    @Override
    public String getSquare() {
        return "SmallSquare";
    }
}
