public class SimpleHello implements Hello {
    @Override
    public void hello(String s) {
        System.out.println("Hello " + s);
    }
}
