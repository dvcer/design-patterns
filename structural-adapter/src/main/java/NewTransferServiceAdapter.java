import java.math.BigDecimal;

public class NewTransferServiceAdapter implements NewTransferService {
    private TransferService transferService;

    public NewTransferServiceAdapter(TransferService transferService) {
        this.transferService = transferService;
    }

    @Override
    public void addToAccount(String telephoneNumber, BigDecimal sum) {
        Account account = findAccountByTelephoneNumber(telephoneNumber);
        transferService.addToAccount(account, sum);
    }

    private Account findAccountByTelephoneNumber(String telephoneNumber) {
        return new Account();
    }
}
