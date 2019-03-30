package ru.mukhin.factory;

public class SavingAccount implements Account {
    public static String NAME = "SAVE";

    @Override
    public String getName() {
        return NAME;
    }
}
