import org.junit.Assert;
import org.junit.Test;

public class testBuilder {
    @Test
    public void testBuilder() {
        int testId = 1;
        String testName = "name";
        Account account = Account.getBuilder().withId(testId).withName(testName).build();
        Assert.assertEquals(testId, account.getId());
        Assert.assertEquals(testName, account.getName());
    }
}
