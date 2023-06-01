package notifyme.observable;

import notifyme.observer.NotificationAlertObserver;

public interface StocksObservable {

    void addNotificationObserver(NotificationAlertObserver notificationAlertObserver);

    void removeNotificationObserver(NotificationAlertObserver notificationAlertObserver);

    void notifyNotificationObservers();

    void setStockCount(int stockCount);

    int getStockCount();

}
