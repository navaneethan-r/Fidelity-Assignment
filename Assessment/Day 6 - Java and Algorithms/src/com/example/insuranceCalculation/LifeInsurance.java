package com.example.insuranceCalculation;

public class LifeInsurance extends Insurance{

    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, Double amountCovered) {
        super(insuranceNo, insuranceName, amountCovered);
    }

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public float getBenefitPercent() {
        return benefitPercent;
    }

    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    @Override
    public double calculatePremium(){
        double premium;
        double benefitAmount = (getAmountCovered() * benefitPercent) / 100;
        double netAmount = getAmountCovered() - benefitAmount;
        premium = netAmount / policyTerm;
        return premium;
    }
}
