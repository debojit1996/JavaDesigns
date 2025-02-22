package com.debo.university;

public interface University {

    AdmitCard getAdmitCard(String subject);
    FeeCalculator getUniversityFee(String subject);
}
