public class ClosedState extends AbstractState {
    public ClosedState(TurnStile turnStile) {
        super(turnStile);
    }

    @Override
    public String onEntry() {
        return "TurnStile is closed. Please use your ticket.";
    }

    @Override
    public String onTicketCheck(Ticket ticket) {
        if (ticket.isValidTicket()) {
            ticket.postPassingOperation();
            turnStile.setOpen(true);
            turnStile.changeState(new OpenState(turnStile));
            return "Ticket is valid. Passage is opened.";
        }
        return "Ticket is not valid. Passage is closed.";
    }
}
