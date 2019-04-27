public class LengthMessageVerifier extends MessageVerifier {
    @Override
    public boolean validate(String s) {
        if (s.length() < 5) {
            System.out.println("Rejected! Length of message less then 5: " + s);
            return false;
        }
        return checkNext(s);
    }
}
