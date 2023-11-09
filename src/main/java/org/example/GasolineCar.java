package org.example;

public class GasolineCar extends AFuelCar {


    public String getFuelType() {
        return "Gasoline";
    }
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String toString() {
        return  super.toString() + "den kører på: " + getFuelType();

        /*"registrationNumber: " + getRegistrationNumber() + "\n" +
                "make: " + getMake() + "model: " + getModel() + "\n" +
                "numberOfDoors: " + getNumberOfDoors() + "\n" +
                "kmPrLitre: " + getKmPrLitre();*/
    }

    public int getRegistrationFee() {
        if (getKmPrLitre() > 20) {
            return 330;

        } else if (getKmPrLitre() > 15) {
            return 1050;
        } else if (getKmPrLitre() > 10) {
            return 2340;
        } else if (getKmPrLitre() > 5) {
            return 5500;
        } else{
            return 10470;
        }

    }
    //Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.??????


}
