public class LazyInitProxyHello implements Hello {
   private Hello hello;
    @Override
    public void hello(String s) {
      if(hello == null){
          hello = new SimpleHello();
          System.out.println("LAZY INITIALIZATION!!");
      }
      hello.hello(s);
    }
}
