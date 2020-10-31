import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String videoTitle;


    @Override
    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers(String videoTitle) {
        for(Observer sub: subscribers) {
            sub.update(videoTitle);
        }
    }

    @Override
    public void upload(String title) {
        this.videoTitle = title;
        notifyAllSubscribers(this.videoTitle);
    }
}
