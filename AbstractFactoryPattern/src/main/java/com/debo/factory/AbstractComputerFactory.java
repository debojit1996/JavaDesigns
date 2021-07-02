package com.debo.factory;

import com.debo.factory.exception.InvalidGadgetException;
import com.debo.factory.gadgets.Gadget;
import com.debo.factory.type.GadgetType;

public interface AbstractComputerFactory {
    Gadget createInstance(GadgetType type) throws InvalidGadgetException;
}
