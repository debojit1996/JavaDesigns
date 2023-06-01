package notifyme.observable;

import java.util.ArrayList;
import java.util.List;

import notifyme.observer.NotificationAlertObserver;

public class IphoneStockObservableImpl implements StocksObservable{

    private final List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    private int currentStockCount = 0;

    @Override
    public void addNotificationObserver(NotificationAlertObserver notificationAlertObserver) {
        System.out.println("Adding a new observer");
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void removeNotificationObserver(NotificationAlertObserver notificationAlertObserver) {
        System.out.println("Removing a new observer");
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyNotificationObservers() {
        System.out.println("Notifying ".concat(String.valueOf(notificationAlertObservers.size())).concat(" of observers"));
        for (NotificationAlertObserver notificationAlertObserver : notificationAlertObservers) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (this.currentStockCount == 0 && this.currentStockCount + stockCount >= 1) {
            notifyNotificationObservers();
        }
        this.currentStockCount = this.currentStockCount + stockCount;
    }

    @Override
    public int getStockCount() {
        return this.currentStockCount;
    }
}
