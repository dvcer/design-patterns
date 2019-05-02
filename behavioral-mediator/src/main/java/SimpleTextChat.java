public class SimpleTextChat extends Chat {
    @Override
    void sendMessage(User user, String message) {
        users.stream()
                .filter(e -> user != e)
                .forEach((e) -> e.get(message));
    }

    @Override
    void addUser(User user) {
        users.add(user);
    }

    @Override
    void showUsers() {
        System.out.println(users);
    }
}
