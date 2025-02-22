package com.debo.university.publicowned;

import com.debo.university.University;
import com.debo.university.UniversityFactory;
import com.debo.university.AdmitCard;
import com.debo.university.publicowned.admit.ASUAdmitCard;
import com.debo.university.publicowned.admit.USCAdmitCard;
import com.debo.university.FeeCalculator;
import com.debo.university.publicowned.fee.ASUFeeCalculator;
import com.debo.university.publicowned.fee.USCFeeCalculator;

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
