import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimplePublisher implements Publisher {
    HashMap<EvenType, List<Subscriber>> subsMap= new HashMap<>();

    public SimplePublisher(EvenType... types) {
        for (EvenType type : types) {
            subsMap.put(type, new ArrayList<>());
        }
    }

    @Override
    public void subscribe(EvenType type, Subscriber subscriber) {
        subsMap.get(type).add(subscriber);
    }

    @Override
    public void unsubscribe(EvenType type, Subscriber subscriber) {
        subsMap.get(type).remove(subscriber);

    }

    @Override
    public void notify(EvenType type, String name) {
        subsMap.get(type).forEach(e -> e.update(type, name));
    }
}
