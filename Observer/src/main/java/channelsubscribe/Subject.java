package channelsubscribe;

public interface Subject {
    void subscribe(Observer subscriber);

    void unsubscribe(Observer subscriber);

    void notifyAllSubscribers(String videoTitle);

    void upload(String title);
}
