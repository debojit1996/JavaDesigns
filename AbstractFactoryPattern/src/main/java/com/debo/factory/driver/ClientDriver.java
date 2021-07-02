package com.debo.factory.driver;

import com.debo.factory.ComputerFactory;
import com.debo.factory.GadgetFactory;
import com.debo.factory.HandsetFactory;
import com.debo.factory.gadgets.Gadget;
import com.debo.factory.type.ComputerType;
import com.debo.factory.type.HandsetType;

public class ClientDriver {

    public static void main(String[] args) {
        Gadget laptop = GadgetFactory.createInstance(ComputerType.LAPTOP,
                new ComputerFactory("16 GB", "1 TB", "2.5 GHz", true, true));
        System.out.println("Lets check laptop specs: " + laptop);

        Gadget mobile = GadgetFactory.createInstance(HandsetType.MOBILE,
                new HandsetFactory("8 GB", "64 GB", "1 GHz", true, false));
        System.out.println("Lets check mobile specs: " + mobile);

        Gadget pc = GadgetFactory.createInstance(ComputerType.PC,
                new ComputerFactory("64 GB", "10 TB", "4.5 GHz", true, false));
        System.out.println("Lets check server specs: " + pc);

        Gadget tablet = GadgetFactory.createInstance(HandsetType.TABLET,
                new HandsetFactory("8 GB", "256 GB", "2 GHz", true, true));
        System.out.println("Lets check tablet specs: " + tablet);
    }
}
