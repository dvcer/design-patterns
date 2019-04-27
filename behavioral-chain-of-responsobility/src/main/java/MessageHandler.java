import java.util.HashSet;
import java.util.Set;

public class MessageHandler {
    Set<String> storage;
    MessageVerifier messageVerifier;

    public void setMessageVerifier(MessageVerifier messageVerifier) {
        this.messageVerifier = messageVerifier;
    }

    public void setStorage(Set<String> storage) {
        this.storage = storage;
    }

    public void handle(String message) {
        if (messageVerifier.validate(message)) {
            System.out.println("New message was added to storage: " + message);
            storage.add(message);
        }
    }
}
