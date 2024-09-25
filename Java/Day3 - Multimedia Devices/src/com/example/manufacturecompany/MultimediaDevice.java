package com.example.manufacturecompany;

public class  MultimediaDevice {

    protected String brand;
    protected String model;
    protected int yearOfManufacture;

    public  MultimediaDevice(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + yearOfManufacture);
    }
}
