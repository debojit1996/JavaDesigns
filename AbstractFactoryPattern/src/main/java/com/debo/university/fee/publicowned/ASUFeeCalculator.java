package com.debo.university.fee.publicowned;

import com.debo.university.fee.FeeCalculator;

public class ASUFeeCalculator extends FeeCalculator {
    @Override
    public int calculateFee() {
        return 10000;
    }
}
