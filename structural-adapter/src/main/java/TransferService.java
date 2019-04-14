import java.math.BigDecimal;

public interface TransferService {
    void addToAccount(Account account, BigDecimal sum);
}
