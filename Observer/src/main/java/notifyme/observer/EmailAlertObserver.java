package notifyme.observer;

import notifyme.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private String emailId;
    private StocksObservable stocksObservable;

    public EmailAlertObserver(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.stocksObservable = observable;
    }

    @Override
    public void update() {
        sendEmail(this.emailId, "Hurry up!!, we have new stocks up here");
    }

    void sendEmail(String emailId, String message) {
        System.out.println(message.concat(" for ").concat(emailId));
        // send mail logic
    }
}
