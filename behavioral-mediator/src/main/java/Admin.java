public class Admin extends User {
    User user;

    public Admin(Chat chat) {
        super(chat, "admin");
        this.user = new SimpleUser(chat, "admin");
    }

    @Override
    void send(String message) {
        user.send(message);
    }

    @Override
    void get(String message) {
        user.get(message);
    }

    public void showUsers() {
        chat.showUsers();
    }
}
