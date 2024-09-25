package com.example.manufacturecompany;

public class SmartTv extends MultimediaDevice{

    private final int screenSize;
    private final String[] smartFeatures;

    public SmartTv(String brand, String model, int yearOfManufacture, int screenSize, String[] smartFeatures) {
        super(brand, model, yearOfManufacture);
        this.screenSize = screenSize;
        this.smartFeatures = smartFeatures;
    }

    public void adjustVolume(){
        System.out.println("Adjusting volume on the smart TV");
    }

    public void changeChannel(){
        System.out.println("Changing the channel on the smart TV");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size : " + screenSize + " inches");
        System.out.print("Smart Features : ");
        for(int i=0;i<smartFeatures.length;i++)
        {
            if(i==smartFeatures.length-1){
                System.out.print(smartFeatures[i]);
            }
            else{
                System.out.print(smartFeatures[i] + ", ");
            }
        }
        System.out.println();
    }
}
