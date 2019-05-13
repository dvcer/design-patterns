public class TurnStile implements State {
    private State state;
    private boolean isOpen;

    public TurnStile() {
        this.state = new ClosedState(this);
    }

    @Override
    public String onEntry() {
        return state.onEntry();
    }

    @Override
    public String onTicketCheck(Ticket ticket) {
        return state.onTicketCheck(ticket);
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setState(State state) {
        this.state = state;
    }
}
