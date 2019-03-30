package ru.mukhin.factory;

public class AccountFactory {
    public Account getAccount(String type) {
        switch (type) {
            case "SAVE":
                return new SavingAccount();
            case "SUPER":
                return new SuperAccount();
            default:
                return null;
        }

    }
}
