public class Phone {
    private String os;
    private int ramSize;
    private String processor;
    private int battery;
    private double screenSize;

    public Phone(String os, int ramSize, String processor, int battery, double screenSize) {
        this.os = os;
        this.ramSize = ramSize;
        this.processor = processor;
        this.battery = battery;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ramSize=" + ramSize +
                ", processor='" + processor + '\'' +
                ", battery=" + battery +
                ", screenSize=" + screenSize +
                '}';
    }
}
