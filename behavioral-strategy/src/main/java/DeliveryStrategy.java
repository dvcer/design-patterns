import java.util.function.Consumer;

public class DeliveryStrategy {
    private String name;
    private Runnable runnable;

    public DeliveryStrategy(String name, Runnable runnable) {
        this.name = name;
        this.runnable = runnable;
    }

    public void execute(){
        runnable.run();
    }

    @Override
    public String toString() {
        return name;
    }
}
