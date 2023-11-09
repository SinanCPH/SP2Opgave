package org.example;

public class ElectricCar extends ACar {


    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public double getWhPrKm() {
        double x;
        x =  (100/ (batteryCapacity/91.25));
        return x;
    }

    public int getRegistrationFee() {
        if (getWhPrKm() > 20) {
            return 330;

        } else if (getWhPrKm() > 15) {
            return 1050;
        } else if (getWhPrKm() > 10) {
            return 2340;
        } else if (getWhPrKm() > 5) {
            return 5500;
        } else{
            return 10470;
        }
    }


    public String toString() {
        return super.toString() + batteryCapacity + maxRange;
    }
}
