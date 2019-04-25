import java.io.BufferedReader;

public class SimplePrinter implements MyPrinter{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
