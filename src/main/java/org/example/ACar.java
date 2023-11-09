package org.example;

public abstract class ACar implements Car {

    //"final" = value kan ikke ændres overhovedet

    public final String registrationNumber;

    public final String make;

    public final String model;

    public final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
    return registrationNumber;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    @Override
    public String toString(){
        return "registrationNumber: " + getRegistrationNumber() + "\n" +
                "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "NumberOfDoors: " + getNumberOfDoors();
    }
}
