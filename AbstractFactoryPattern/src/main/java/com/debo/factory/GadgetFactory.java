package com.debo.factory;

import com.debo.factory.exception.InvalidGadgetException;
import com.debo.factory.gadgets.Gadget;
import com.debo.factory.type.GadgetType;

public class GadgetFactory {

    private GadgetFactory() {

    }

    public static Gadget createInstance(GadgetType type, AbstractComputerFactory factory)
            throws InvalidGadgetException {
        return factory.createInstance(type);
    }
}
