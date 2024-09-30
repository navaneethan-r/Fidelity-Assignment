package com.example.insuranceCalculation;

public class MotorInsurance extends Insurance{

    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, Double amountCovered) {
        super(insuranceNo, insuranceName, amountCovered);
    }

    public double getIdv() {
        return idv;
    }

    public void setIdv(double idv) {
        this.idv = idv;
    }

    public float getDepPercent() {
        return depPercent;
    }

    public void setDepPercent(float depPercent) {
        this.depPercent = depPercent;
    }

    @Override
    public double calculatePremium(){
        double premium;
        double idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
        premium = (3.0 / 100) * idv;
        return premium;
    }
}
