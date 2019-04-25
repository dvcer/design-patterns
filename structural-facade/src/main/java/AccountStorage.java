import java.util.HashMap;

public class AccountStorage {
    private HashMap<String, Account> storage = new HashMap<>();

    public void addAccountToStorage(Account acc) {
        storage.put(acc.getName(), acc);
    }

    public Account getAccById(String name) {
        return storage.get(name);
    }
}
