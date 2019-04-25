public class App {
    public static void main(String[] args) {
        String acc1 = "first";
        String acc2 = "second";
        AccountStorage storage = new AccountStorage();
        storage.addAccountToStorage(new Account(acc1));
        storage.addAccountToStorage(new Account(acc2));
        Facade facade = new Facade(storage);

        facade.transferMoneyByName(acc1,acc2,1);
    }
}
