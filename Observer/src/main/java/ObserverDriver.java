public class ObserverDriver {
    public static void main(String[] args) {
        Subject deboLearning = new Channel();

        Observer s1 = new Subscriber("Ban");
        Observer s2 = new Subscriber("Sap");
        Observer s3 = new Subscriber("Bhai");
        Observer s4 = new Subscriber("Sana");
        Observer s5 = new Subscriber("DBA");

        deboLearning.subscribe(s1);
        deboLearning.subscribe(s2);
        deboLearning.subscribe(s3);
        deboLearning.subscribe(s4);
        deboLearning.subscribe(s5);

        s1.subscribeChannel(deboLearning);
        s2.subscribeChannel(deboLearning);
        s3.subscribeChannel(deboLearning);
        s4.subscribeChannel(deboLearning);
        s5.subscribeChannel(deboLearning);

        deboLearning.unsubscribe(s5);

        deboLearning.upload("How to start learning Design Patterns in Java??");
    }
}
