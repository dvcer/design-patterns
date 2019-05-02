public class App {
    public static void main(String[] args) {
        Chat chat = new SimpleTextChat();
        User usr1 = new SimpleUser(chat, "usr1");
        User usr2 = new SimpleUser(chat, "usr2");
        User usr3 = new SimpleUser(chat, "usr3");
        Admin admin = new Admin(chat);
        chat.addUser(usr1);
        chat.addUser(usr2);
        chat.addUser(usr3);
        chat.addUser(admin);

        usr1.send("AAAA");
        usr2.send("BBB");
        admin.send("ya admin");
        admin.showUsers();
    }
}
