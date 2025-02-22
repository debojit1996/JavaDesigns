package com.debo.university.publicowned;

import com.debo.university.University;
import com.debo.university.UniversityFactory;
import com.debo.university.admit.AdmitCard;
import com.debo.university.admit.publicowned.ASUAdmitCard;
import com.debo.university.admit.publicowned.USCAdmitCard;
import com.debo.university.fee.FeeCalculator;
import com.debo.university.fee.publicowned.ASUFeeCalculator;
import com.debo.university.fee.publicowned.USCFeeCalculator;

public class PublicUniversity extends UniversityFactory implements University {

    @Override
    public AdmitCard getAdmitCard(String subject) {
        switch (subject) {
            case "Math":
                return new ASUAdmitCard();
            case "CS":
            case "Physics":
                return new USCAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getUniversityFee(String subject) {
        switch (subject) {
            case "Math":
                return new ASUFeeCalculator();
            case "CS":
            case "Physics":
                return new USCFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
