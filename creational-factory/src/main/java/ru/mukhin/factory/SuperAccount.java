package ru.mukhin.factory;

public class SuperAccount implements Account {
    public static String NAME = "SUPER";

    @Override
    public String getName() {
        return NAME;
    }
}
