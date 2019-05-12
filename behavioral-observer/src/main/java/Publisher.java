public interface Publisher {

    void subscribe(EvenType type, Subscriber subscriber);

    void unsubscribe(EvenType type, Subscriber subscriber);

   void notify(EvenType type, String name);
}
