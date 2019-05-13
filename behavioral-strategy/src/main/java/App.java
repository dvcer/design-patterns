public class App {
    public static void main(String[] args) {
        EverydayRegularNormalPizzeria pizzeria = new EverydayRegularNormalPizzeria();
        pizzeria.makePizza(()-> System.out.println("Delivering pizza by car..."));
        System.out.println();
        pizzeria.makePizza(()-> System.out.println("Waiting while client will take away pizza from pizzeria.."));
        System.out.println();
        pizzeria.makePizza(()-> System.out.println("Delivering pizza by tube.."));
    }
}
