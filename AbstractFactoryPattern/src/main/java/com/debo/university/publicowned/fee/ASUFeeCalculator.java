package com.debo.university.publicowned.fee;

import com.debo.university.FeeCalculator;

public class ASUFeeCalculator extends FeeCalculator {
    @Override
    public int calculateFee() {
        return 10000;
    }
}
