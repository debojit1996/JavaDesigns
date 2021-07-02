package com.debo.factory.type;

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
