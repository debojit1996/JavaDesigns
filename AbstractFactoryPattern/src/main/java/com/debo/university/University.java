package com.debo.university;

import com.debo.university.admit.AdmitCard;
import com.debo.university.fee.FeeCalculator;

public interface University {

    AdmitCard getAdmitCard(String subject);
    FeeCalculator getUniversityFee(String subject);
}
