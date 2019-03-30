package ru.mukhin.absfactory;

public class App {
    private AbstractFactory factory;

    public App(AbstractFactory factory) {
        this.factory = factory;
    }

    public void printObjects() {
        System.out.println(factory.getCircle());
        System.out.println(factory.getSquare());
    }
}
