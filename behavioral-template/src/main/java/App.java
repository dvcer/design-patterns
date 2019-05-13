public class App {
    public static void main(String[] args) {
        Template template = new ATemplate();
        template.execute();
        template = new BTemplate();
        template.execute();
    }
}
