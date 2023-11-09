package org.example;

public class DieselCar extends AFuelCar {


    private boolean particleFilter;

    private boolean hasParticleFilter() {
        return true;
    }

    public String getFuelType() {
        return "Diesel";
    }

    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() > 20) {
            registrationFee = 330 + 130;
        } else if (getKmPrLitre() > 15) {
            registrationFee = 1050 + 1390;
        } else if (getKmPrLitre() > 10) {
            registrationFee = 2340 + 1850;
        } else if (getKmPrLitre() > 5) {
            registrationFee = 5500 + 2770;
        } else {
            registrationFee = 10470 + 15260;
        }
        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "Den kører på: " + getFuelType();
    }

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }




}
