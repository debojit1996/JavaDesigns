package com.debo.university;

public class UniversityDriver {
    public void fetchUniversityAndFeeDetails(int score, String subject) {
        University university = UniversityFactory.getUniversityInstance(score);
        AdmitCard admitCard = university.getAdmitCard(subject);
        admitCard.printAdmit();
        FeeCalculator fee = university.getUniversityFee(subject);
        System.out.println("University Fee is: " + fee.calculateFee());
    }
    public static void main(String[] args) {
        int studentScore = 125;
        UniversityDriver universityDriver = new UniversityDriver();

        universityDriver.fetchUniversityAndFeeDetails(studentScore, "Math");

        studentScore = 101;
        universityDriver.fetchUniversityAndFeeDetails(studentScore, "Math");
    }
}
