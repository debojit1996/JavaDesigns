package com.debo.university.privateowned;

import com.debo.university.University;
import com.debo.university.UniversityFactory;
import com.debo.university.admit.AdmitCard;
import com.debo.university.admit.privateowned.CalTechAdmitCard;
import com.debo.university.admit.privateowned.GeorgiaTechAdmitCard;
import com.debo.university.admit.privateowned.MITAdmitCard;
import com.debo.university.fee.FeeCalculator;
import com.debo.university.fee.privateowned.CalTechFeeCalculator;
import com.debo.university.fee.privateowned.GeorgiaTechFeeCalculator;
import com.debo.university.fee.privateowned.MITFeeCalculator;

public class IvyLeagueUniversity extends UniversityFactory implements University {
    @Override
    public AdmitCard getAdmitCard(String subject) {
        switch (subject) {
            case "Math":
                return new MITAdmitCard();
            case "Physics":
                return new CalTechAdmitCard();
            case "CS":
                return new GeorgiaTechAdmitCard();
            default:
                break;

        }
        return null;
    }

    @Override
    public FeeCalculator getUniversityFee(String subject) {
        switch (subject) {
            case "Math":
                return new MITFeeCalculator();
            case "Physics":
                return new CalTechFeeCalculator();
            case "CS":
                return new GeorgiaTechFeeCalculator();
            default:
                break;

        }
        return null;
    }
}
