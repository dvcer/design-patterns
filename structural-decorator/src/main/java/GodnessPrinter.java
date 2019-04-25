public class GodnessPrinter extends DecoratorPrinter {


    public GodnessPrinter(MyPrinter printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        System.out.println("****************************");
        printer.print(s);
        System.out.println("****************************");
    }
}
