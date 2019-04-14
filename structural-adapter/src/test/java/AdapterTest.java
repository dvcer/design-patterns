import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.System.setOut;

public class AdapterTest {

    @Rule
    public TemporaryFolder tf = new TemporaryFolder();

    @Test
    public void AdapterTest() throws IOException {
        String path = tf.newFile("Test").getAbsolutePath();
        setOut(new PrintStream(path));
        NewTransferService ntsa = new NewTransferServiceAdapter(new TransferServiceImpl());
        ntsa.addToAccount("88002005020", new BigDecimal(1));
        try (BufferedReader in = Files.newBufferedReader(Paths.get(path))) {
            Assert.assertEquals(Account.MONEY_ADDING_TEXT, in.lines().findFirst().get());
        }
    }
}
