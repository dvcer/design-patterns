public class LogSubscriber implements Subscriber {
    @Override
    public void update(EvenType type, String name) {
        System.out.println("LOGGING!");
        System.out.println("EVENT_TYPE: " + type.name());
        System.out.println("OBJECT_NAME: " + name);
    }
}
