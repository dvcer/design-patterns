public abstract class MessageVerifier {
    private MessageVerifier next;

    public MessageVerifier linkWith(MessageVerifier next) {
        this.next = next;
        return next;
    }

    protected boolean checkNext(String s) {
        return next == null ? true : next.validate(s);
    }

    public abstract boolean validate(String s);
}
