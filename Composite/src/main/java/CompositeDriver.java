public class CompositeDriver {

    public static void main(String[] args) {
        Component hdd = new Leaf(3600, "HDD");
        Component mouse = new Leaf(250, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(12000, "CPU");

        Composite peripheral = new Composite("Peripheral Devices");
        Composite motherboard = new Composite("Motherboard");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Poora Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

        computer.showPrice();
    }
}
