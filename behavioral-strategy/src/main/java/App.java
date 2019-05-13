import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        Map<Integer, DeliveryStrategy> strategies = new HashMap<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        strategies.put(1, new DeliveryStrategy("By car",() -> System.out.println("Delivering pizza by car...")));
        strategies.put(2, new DeliveryStrategy("By client",() -> System.out.println("Waiting while client will take away pizza from pizzeria..")));
        strategies.put(3, new DeliveryStrategy("By magic-tube",() -> System.out.println("Delivering pizza by magic-tube..")));
        EverydayRegularNormalPizzeria pizzeria = new EverydayRegularNormalPizzeria();
        System.out.println("Choose delivery strategy: ");
        strategies.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.print("Enter number of strategy: ");
        Integer selectedNumber = Integer.valueOf(in.readLine());
        pizzeria.makePizza(strategies.get(selectedNumber));
    }
}
