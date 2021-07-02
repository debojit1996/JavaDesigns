package com.debo.factory.type;

public enum ComputerType implements GadgetType{
    LAPTOP {
        @Override
        public String getGadgetType() {
            return ComputerType.LAPTOP.name();
        }
    },
    PC {
        @Override
        public String getGadgetType() {
            return ComputerType.PC.name();
        }
    };
}
