package com.debo.factory;

import com.debo.factory.exception.InvalidGadgetException;
import com.debo.factory.gadgets.Handset;
import com.debo.factory.impl.Mobile;
import com.debo.factory.impl.Tablet;
import com.debo.factory.type.GadgetType;
import com.debo.factory.type.HandsetType;
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
