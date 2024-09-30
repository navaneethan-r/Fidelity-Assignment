package com.example.insuranceCalculation;

public class Insurance {

    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public Double getAmountCovered() {
        return amountCovered;
    }

    public Insurance(String insuranceNo, String insuranceName, Double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }

    double calculatePremium() {
        return 0;
    }
}
