public class ContainsMessageVerifier extends MessageVerifier {
    @Override
    public boolean validate(String s) {
        if (s.contains("o")) {
            System.out.println("Rejected! Message contains letter 'o': " + s);
            return false;
        }
        return checkNext(s);
    }
}
