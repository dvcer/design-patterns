public class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void send(String message) {
        chat.sendMessage(this, message);
    }

    @Override
    void get(String message) {
        System.out.println("User " + name + " recieved message: " + message);
    }
}
