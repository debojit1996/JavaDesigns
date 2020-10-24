package phone;

public class OperatingSystemFactory {
    public static OS getInstance(String str) {
        if(str.equalsIgnoreCase("open")) {
            return new Android();
        }
        else if(str.equalsIgnoreCase("closed")) {
            return new iOS();
        }
        return new Windows();
    }
}
