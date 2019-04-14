import java.math.BigDecimal;

public class TransferServiceImpl implements TransferService {
    @Override
    public void addToAccount(Account account, BigDecimal sum) {
        account.putMoneyOn(sum);
    }
}
