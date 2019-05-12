public class MailSubscriber implements Subscriber {
    @Override
    public void update(EvenType type, String name) {
        System.out.println("MAIL!");
        System.out.println("EVENT_TYPE: " + type.name());
        System.out.println("OBJECT_NAME: " + name);
    }
}
