package org.example;

public class Main {
    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("IN 23 8475", "BMW", "520d" , 5, 14));
        fleetOfCars.addCar(new GasolineCar("BK 23 9071", "Mercedes", "GLE", 5,35));
        fleetOfCars.addCar(new GasolineCar("AU 50 0835", "Dacia", "Duster Prestige", 5,10));

        fleetOfCars.addCar(new DieselCar("UP 29 8904", "Dacia", "Duster", 5, 19, true ));
        fleetOfCars.addCar(new DieselCar("PO 93 8720", "Fiat", "500", 3,25,true));
        fleetOfCars.addCar(new DieselCar("UN 29 8904", "BMW", "X5", 5,15,true));

        fleetOfCars.addCar(new ElectricCar("EN 21 1098", "Hyundai", "Kona", 5,64,449));
        fleetOfCars.addCar(new ElectricCar( "DA 26 8946", "Seat", "Mii ELECTRIC", 3, 37, 260));
        fleetOfCars.addCar(new ElectricCar( "KP 11 0982", "Citroën", "ë-C4 ELECTRIC", 5, 15, 343));
        System.out.println(fleetOfCars);

    }
}