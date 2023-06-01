package notifyme.observer;

import notifyme.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String mobileNum;
    private StocksObservable stocksObservable;

    public MobileAlertObserver(String mobileNum, StocksObservable observable) {
        this.mobileNum = mobileNum;
        this.stocksObservable = observable;
    }

    @Override
    public void update() {
        sendNotificationToMobile(mobileNum, "Hurry up!! the stocks are up again");
    }

    private void sendNotificationToMobile(String mobileNum, String message) {
        System.out.println("Notification sent to mobile num: ".concat(mobileNum).concat(" with message: ").concat(message));
    }
}
