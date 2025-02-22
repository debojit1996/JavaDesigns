package com.debo.devicefactory;

import com.debo.devicefactory.exception.InvalidGadgetException;
import com.debo.devicefactory.gadgets.Gadget;
import com.debo.devicefactory.type.GadgetType;

public class GadgetFactory {

    private GadgetFactory() {

    }

    public static Gadget createInstance(GadgetType type, AbstractComputerFactory factory)
            throws InvalidGadgetException {
        return factory.createInstance(type);
    }
}
