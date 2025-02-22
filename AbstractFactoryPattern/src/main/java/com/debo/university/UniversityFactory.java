package com.debo.university;

import com.debo.university.privateowned.IvyLeagueUniversity;
import com.debo.university.publicowned.PublicUniversity;

public abstract class UniversityFactory {
    private static int cutOff = 110;

    public static University getUniversityInstance(int score) {
        if (score > cutOff) {
            return new PublicUniversity();
        }
        return new IvyLeagueUniversity();
    }

}
