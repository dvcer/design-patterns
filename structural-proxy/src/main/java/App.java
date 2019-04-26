public class App {
    public static void main(String[] args) {
        Hello hello = new LazyInitProxyHello();
        hello.hello("World");
        hello.hello("World");
        hello.hello("World");
        hello.hello("World");
    }
}
