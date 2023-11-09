package org.example;

import java.util.ArrayList;

public class FleetOfCars {


    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
    fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
    int x = 0;
        for(Car s : fleet)
        {
           x = s.getRegistrationFee();
        }

        return x;

    }

    @Override
    public String toString(){
        return "fleet " + fleet;
    }
}
