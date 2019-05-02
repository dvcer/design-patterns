import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Chat {
    protected Set<User> users = new HashSet<>();

    abstract void sendMessage(User user, String message);

    abstract void addUser(User user);

    abstract void showUsers();

}
