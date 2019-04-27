import java.util.Set;

public class ContainsInStorageMessageVerifier extends MessageVerifier {
    private Set<String> storage;

    public ContainsInStorageMessageVerifier(Set<String> storage) {
        this.storage = storage;
    }

    @Override
    public boolean validate(String s) {
        if (storage.contains(s)) {
            System.out.println("Rejected! Message is already in storage: " + s);
            return false;
        }
        return checkNext(s);
    }
}
