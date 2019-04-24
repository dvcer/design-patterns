package ru.mukhin;

public class App {
    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.createFactory(builder -> {
            builder.add(NumberType.One, One::new);
            builder.add(NumberType.Two, Two::new);
        });
        factory.create(NumberType.One).showName();
        factory.create(NumberType.Two).showName();
    }

}
