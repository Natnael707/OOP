package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {


   public static void main(String[]args) {

        Car car1 = new Car();

        car1.SetSpeed(76.0);
        car1.SetFuelLevel(80);
        car1.Drive(9000);

        System.out.println();

        System.out.println("Speed Of Car1: "  + car1.getSpeedMph() + " MPH.");
        System.out.println("Distance of car1: " + car1.getDistanceKm() + " KM.");
        System.out.println ( "Remaining Fuel Level: " + car1.calculate_remaining_fuel(100) + "%.");

        System.out.println();

        ElectricCar Ecar1 = new ElectricCar();

        Ecar1.SetSpeed(60);
        Ecar1.setBatteryLevel(100);
        Ecar1.Drive(7000);


        System.out.println("Speed of Ecar1: " + Ecar1.getSpeedMph() + " MPH.");
        System.out.println("Distance covered by Ecar1: "+Ecar1.getDistanceKm() + " KM.");
        System.out.println("Ramaining Battery Level: " + Ecar1.calculate_remaining_battery(900)+ "%.");




    }
}
