import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        MessageHandler handler = init();
        handler.handle("AAAAA");
        handler.handle("BBBBB");
        handler.handle("AAAAA");
        handler.handle("AAAA");
        handler.handle("AAAAAAo");
        handler.handle("ooo");

    }

    private static MessageHandler init() {
        MessageHandler handler = new MessageHandler();
        Set<String> storage = new HashSet<>();
        handler.setStorage(storage);
        MessageVerifier verifier = new LengthMessageVerifier();
        verifier.linkWith(new ContainsMessageVerifier()).linkWith(new ContainsInStorageMessageVerifier(storage));
        handler.setMessageVerifier(verifier);
        return handler;
    }


}
