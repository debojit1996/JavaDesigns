package channelsubscribe;

public interface Observer {
    void update(String title);

    void subscribeChannel(Subject ch);
}
