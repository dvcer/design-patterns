public class ClosedState extends AbstractState {
    public ClosedState(TurnStile turnStile) {
        super(turnStile);
    }

    @Override
    public String onEntry() {
        return "TurnStile is closed. Please use your ticket."
    }

    @Override
    public String onTicketCheck(Ticket ticket) {
        if (ticket.isValidTicket()) {
            ticket.postPassingOperation();
            turnStile.setOpen(true);
            return "Passage is opened.";
        }
        return "Passage is closed. Please buy new ticket.";
    }
}
