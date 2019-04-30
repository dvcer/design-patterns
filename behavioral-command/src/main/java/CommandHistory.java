import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CommandHistory {
    private ConcurrentLinkedDeque<Command> history = new ConcurrentLinkedDeque<>();

    public void offerCommand(Command command) {
        history.offerFirst(command);
    }

    public Command pollCommand() {
        return history.pollFirst();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
