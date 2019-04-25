public class App {
    public static void main(String[] args) {
        MyPrinter printer = new SimplePrinter();
        printer.print("AAAAA");
        System.out.println();
        printer = new GodnessPrinter(printer);
        printer.print("AAAAA");
    }
}

