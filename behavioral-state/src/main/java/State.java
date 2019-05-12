public interface State {
    String onEntry();
    String onTicketCheck(Ticket ticket);
}
