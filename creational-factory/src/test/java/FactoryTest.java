import org.junit.Assert;
import org.junit.Test;
import ru.mukhin.factory.Account;
import ru.mukhin.factory.AccountFactory;
import ru.mukhin.factory.SavingAccount;
import ru.mukhin.factory.SuperAccount;

public class FactoryTest {
    @Test
    public void factoryTest() {
        AccountFactory factory = new AccountFactory();
        Account save_acc = factory.getAccount("SAVE");
        Account super_acc = factory.getAccount("SUPER");
        Assert.assertEquals(save_acc.getName(), SavingAccount.NAME);
        Assert.assertEquals(super_acc.getName(), SuperAccount.NAME);
    }
}
