package com.debo.university.privateowned.fee;

import com.debo.university.FeeCalculator;

public class MITFeeCalculator extends FeeCalculator {
    @Override
    public int calculateFee() {
        return 70000;
    }
}
