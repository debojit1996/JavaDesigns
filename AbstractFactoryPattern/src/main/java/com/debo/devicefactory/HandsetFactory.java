package com.debo.devicefactory;

import com.debo.devicefactory.exception.InvalidGadgetException;
import com.debo.devicefactory.gadgets.Handset;
import com.debo.devicefactory.impl.Mobile;
import com.debo.devicefactory.impl.Tablet;
import com.debo.devicefactory.type.GadgetType;
import com.debo.devicefactory.type.HandsetType;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class HandsetFactory implements AbstractComputerFactory {

    private final String ram;
    private final String hdd;
    private final String cpu;
    private final boolean isBluetoothEnabled;
    private final boolean isGraphicsEnabled;


    @Override
    public Handset createInstance(GadgetType type) {
        if (type.getGadgetType().equalsIgnoreCase(HandsetType.TABLET.getGadgetType())) {
            return new Tablet(ram, hdd, cpu, isBluetoothEnabled, isGraphicsEnabled);
        } else if (type.getGadgetType().equalsIgnoreCase(HandsetType.MOBILE.getGadgetType())) {
            return new Mobile(ram, hdd, cpu, isBluetoothEnabled, isGraphicsEnabled);
        }
        throw new InvalidGadgetException("Please provide correct HandsetType!!!");
    }
}
