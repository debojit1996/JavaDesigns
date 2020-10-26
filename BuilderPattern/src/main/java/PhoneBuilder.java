public class PhoneBuilder {
    private String os;
    private int ramSize;
    private String processor;
    private int battery;
    private double screenSize;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRamSize(int ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone getPhone() {
        return new Phone("Android", 12, "Qualcomm Snapdragon", 4000, 6.4);
    }
}
