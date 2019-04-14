import java.math.BigDecimal;

public interface NewTransferService {
    void addToAccount(String telephoneNumber, BigDecimal sum);
}
