import org.junit.Assert;
import org.junit.Test;
import ru.mukhin.singleton.Singleton;

public class SingletonTest {
    @Test
    public void signletonTest() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Assert.assertEquals(s1, s2);
    }
}
