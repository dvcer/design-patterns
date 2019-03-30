import org.junit.Assert;
import org.junit.Test;
import ru.mukhin.prototype.FirstPrototype;
import ru.mukhin.prototype.Prototype;
import ru.mukhin.prototype.SecondPrototype;

public class PrototypeTest {
    @Test
    public void prototypeTest() {
        Prototype p1 = new FirstPrototype();
        Prototype p2 = new SecondPrototype();
        Prototype p1Clone = (Prototype) p1.clone();
        Prototype p2Clone = (Prototype) p2.clone();
        Assert.assertEquals(FirstPrototype.NAME, p1Clone.getName());
        Assert.assertEquals(SecondPrototype.NAME, p2Clone.getName());
    }
}
