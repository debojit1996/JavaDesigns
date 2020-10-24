import phone.OS;
import phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OS getOSImplInstance = OperatingSystemFactory.getInstance("open");
        getOSImplInstance.spec();
    }
}
