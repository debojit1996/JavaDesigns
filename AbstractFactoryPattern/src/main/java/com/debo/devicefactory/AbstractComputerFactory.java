package com.debo.devicefactory;

import com.debo.devicefactory.exception.InvalidGadgetException;
import com.debo.devicefactory.gadgets.Gadget;
import com.debo.devicefactory.type.GadgetType;

public interface AbstractComputerFactory {
    Gadget createInstance(GadgetType type) throws InvalidGadgetException;
}
