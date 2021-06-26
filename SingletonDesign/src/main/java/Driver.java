import com.debo.design.SingleTon;

public class Driver {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon anotherObject = SingleTon.getInstance();
        singleTon.setHello(10);
        // Both sysouts print the same value which proves that its a single shared instance following the Singleton
        // design pattern
        System.out.println("1st objects hello "+singleTon.getHello());
        System.out.println("2nd objects hello "+anotherObject.getHello());
    }
}
