package com.debo.devicefactory.gadgets;

public interface Handset extends Gadget {
    public abstract String ram();
    public abstract String hdd();
    public abstract String cpu();

    public boolean isBluetoothEnabled();
    public boolean isGraphicsEnabled();
}
