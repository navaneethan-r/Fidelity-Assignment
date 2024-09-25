package com.example.manufacturecompany;

public class HomeTheaterSystem extends SmartTv{

    public HomeTheaterSystem(String brand, String model, int yearOfManufacture, int screenSize, String[] smartFeatures) {
        super(brand, model, yearOfManufacture, screenSize, smartFeatures);
    }

    public void adjustBass(){
        System.out.println("Adjusting bass in the home theater system");
    }

    public void adjustTreble(){
        System.out.println("Adjusting treble in the home theater system");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
