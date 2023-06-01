package notifyme;

import notifyme.observable.IphoneStockObservableImpl;
import notifyme.observable.StocksObservable;
import notifyme.observer.EmailAlertObserver;
import notifyme.observer.MobileAlertObserver;
import notifyme.observer.NotificationAlertObserver;

public class Driver {

    public static void main(String[] args) {

        StocksObservable stocksObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observerOne = new EmailAlertObserver("devkashyap9912@gmail.com", stocksObservable);
        NotificationAlertObserver observerTwo = new EmailAlertObserver("nivi1994@gmail.com", stocksObservable);
        NotificationAlertObserver observerThree = new MobileAlertObserver("8011108298", stocksObservable);

        stocksObservable.addNotificationObserver(observerOne);
        stocksObservable.addNotificationObserver(observerTwo);
        stocksObservable.addNotificationObserver(observerThree);

        stocksObservable.setStockCount(5);
    }
}
