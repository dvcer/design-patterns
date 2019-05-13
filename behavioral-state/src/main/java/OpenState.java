public class OpenState extends AbstractState {
    private boolean alreadyClosed;
    public OpenState(TurnStile turnStile) {
        super(turnStile);
        new Thread(() -> {
            try {
                for (int i = 5; i > 0; i--) {
                    System.err.println(i);
                    Thread.sleep(1000);
                    if (alreadyClosed) {
                        return;
                    }
                }
                turnStile.setOpen(false);
                turnStile.changeState(new ClosedState(turnStile));
                System.err.println("Oops.. Too late. Passage closed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public String onEntry() {
        turnStile.setOpen(false);
        turnStile.setState(new ClosedState(turnStile));
        alreadyClosed = true;
        return "Passanger passed. Passage is closed again.";

    }

    @Override
    public String onTicketCheck(Ticket ticket) {
        return "Passage is already opened. You can pass.";
    }
}
