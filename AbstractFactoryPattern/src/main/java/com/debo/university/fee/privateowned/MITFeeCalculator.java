package com.debo.university.fee.privateowned;

import com.debo.university.fee.FeeCalculator;

public class MITFeeCalculator extends FeeCalculator {
    @Override
    public int calculateFee() {
        return 70000;
    }
}
