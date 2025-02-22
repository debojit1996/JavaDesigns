package com.debo.devicefactory.type;

public enum HandsetType implements GadgetType {
    MOBILE {
        @Override
        public String getGadgetType() {
            return HandsetType.MOBILE.name();
        }
    },
    TABLET {
        @Override
        public String getGadgetType() {
            return HandsetType.TABLET.name();
        }
    };
}
