package com.example.manufacturecompany;

public class BasicMediaPlayer extends MultimediaDevice{

    private final String[] supportFormat;

    public BasicMediaPlayer(String brand, String model, int yearOfManufacture, String[] supportFormat) {
        super(brand, model, yearOfManufacture);
        this.supportFormat = supportFormat;
    }

    public void play(){
        System.out.println("Playing multimedia Content");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Supported Formats : ");
        for(int i=0;i<supportFormat.length;i++){
            if(i==supportFormat.length-1)
            {
                System.out.print(supportFormat[i]);
            }
            else{
                System.out.print(supportFormat[i] + ", ");
            }
        }
        System.out.println();
    }
}
