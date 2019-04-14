import java.math.BigDecimal;

public class Account {

    public static final String MONEY_ADDING_TEXT = "Add money to account";

    public void putMoneyOn(BigDecimal sum) {
        System.out.println(MONEY_ADDING_TEXT);
    }
}
