public class NotValidTicket implements Ticket {
    @Override
    public boolean isValidTicket() {
        return false;
    }

    @Override
    public void postPassingOperation() {

    }
}
