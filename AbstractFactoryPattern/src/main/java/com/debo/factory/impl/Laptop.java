package com.debo.factory.impl;

import com.debo.factory.gadgets.Computer;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Laptop implements Computer {

    private final String ram;
    private final String hdd;
    private final String cpu;
    private final boolean isBluetoothEnabled;
    private final boolean isGraphicsEnabled;

    @Override
    public String ram() {
        return ram;
    }

    @Override
    public String hdd() {
        return hdd;
    }

    @Override
    public String cpu() {
        return cpu;
    }

    @Override
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }
}
