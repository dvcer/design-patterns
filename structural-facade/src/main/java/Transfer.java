public class Transfer {

    public void transferMoney(Account from, Account to, int sum) {
        from.setBalance(from.getBalance() - sum);
        to.setBalance(to.getBalance() + sum);
        System.out.println("Transfer from " + from.getName() + " to " + to.getName() + " completed");
    }
}
