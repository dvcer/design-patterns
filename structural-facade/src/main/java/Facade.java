public class Facade {

    private AccountStorage accountStorage;
    private Transfer transfer = new Transfer();

    public Facade(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void transferMoneyByName(String from, String to, int sum) {
        Account accFrom = accountStorage.getAccById(from);
        Account accTo = accountStorage.getAccById(to);
        transfer.transferMoney(accFrom, accTo, sum);
    }
}
