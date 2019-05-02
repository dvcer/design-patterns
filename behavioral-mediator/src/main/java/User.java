public abstract class User {
    protected Chat chat;
    protected String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void send(String message);

    abstract void get(String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
