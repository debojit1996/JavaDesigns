import com.debo.design.SingleTon;

public class Driver {
    public static void main(String[] args) {
//        SingleTon singleTon = SingleTon.getInstance();
//        SingleTon anotherObject = SingleTon.getInstance();
//        singleTon.setHello(10);
        // Both sysouts print the same value which proves that its a single shared instance following the Singleton
        // design pattern
//        System.out.println("1st objects hello "+singleTon.getHello());
//        System.out.println("2nd objects hello "+anotherObject.getHello());
        var t1 = new Thread(() -> {
            var obj1 = SingleTon.getInstance();
            obj1.setHello(20);
            System.out.println("Thread 1 value: "+obj1.getHello());
        });

        var t2 = new Thread(() -> {
            var obj1 = SingleTon.getInstance();
            obj1.setHello(30);
            System.out.println("Thread 2 value: "+obj1.getHello());
        });
        t1.start();
        t2.start();
    }
}
