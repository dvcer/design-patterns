public abstract class DecoratorPrinter implements MyPrinter {

    public DecoratorPrinter(MyPrinter printer) {
        this.printer = printer;
    }

    protected MyPrinter printer;

}
