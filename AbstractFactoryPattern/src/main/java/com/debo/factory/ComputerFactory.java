package com.debo.factory;

import com.debo.factory.exception.InvalidGadgetException;
import com.debo.factory.gadgets.Computer;
import com.debo.factory.impl.Laptop;
import com.debo.factory.impl.PC;
import com.debo.factory.type.ComputerType;
import com.debo.factory.type.GadgetType;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ComputerFactory implements AbstractComputerFactory{

    private final String ram;
    private final String hdd;
    private final String cpu;
    private final boolean isBluetoothEnabled;
    private final boolean isGraphicsEnabled;


    @Override
    public Computer createInstance(GadgetType type) {
        if (type.getGadgetType().equalsIgnoreCase(ComputerType.LAPTOP.name())) {
            return new Laptop(ram, hdd, cpu, isBluetoothEnabled, isGraphicsEnabled);
        } else if (type.getGadgetType().equalsIgnoreCase(ComputerType.PC.name())) {
            return new PC(ram, hdd, cpu, isBluetoothEnabled, isGraphicsEnabled);
        }
        throw new InvalidGadgetException("The gadget Type is invalid!!! Please provide a correct type");
    }
}
