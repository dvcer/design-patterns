import org.junit.Test;
import ru.mukhin.absfactory.App;
import ru.mukhin.absfactory.BigSizesFactory;
import ru.mukhin.absfactory.SmallSizesFactory;

public class AbsFactoryTest {
    @Test
    public void absFactoryTest() {
        new App(new BigSizesFactory()).printObjects();
        new App(new SmallSizesFactory()).printObjects();
    }
}
