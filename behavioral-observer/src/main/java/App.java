public class App {
    public static void main(String[] args) {
        Publisher publisher = new SimplePublisher(EvenType.values());
        Subscriber sub1 = new LogSubscriber();
        Subscriber sub2 = new MailSubscriber();
        publisher.subscribe(EvenType.EATING, sub1);
        publisher.subscribe(EvenType.SITTING, sub1);
        publisher.subscribe(EvenType.SITTING, sub2);
        publisher.subscribe(EvenType.STANDING, sub2);
        publisher.subscribe(EvenType.WALKING, sub2);

        publisher.notify(EvenType.WALKING,"cow1");
        publisher.notify(EvenType.SITTING,"cow3");
    }
}
