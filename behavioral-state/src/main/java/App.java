public class App {
    public static void main(String[] args) throws InterruptedException {
        TurnStile turnStile = new TurnStile();
        Ticket ticket = new Simple60Ticket();
        System.err.println(turnStile.onEntry());
        System.err.println(turnStile.onTicketCheck(ticket));
        Thread.sleep(3000);
        System.err.println(turnStile.onEntry());
        System.err.println(turnStile.onTicketCheck(ticket));
        Thread.sleep(6000);
        System.err.println(turnStile.onEntry());
        Ticket invTicket = new NotValidTicket();
        System.err.println(turnStile.onTicketCheck(invTicket));

    }
}
