package com.vehicle;
public class Car {


    private double speed_Kph  ;        // in Kilometer per hour
    private int distance_traveled ;        // in meters
    private float fuel_level  ;            // in Percentage




    public void SetSpeed (double Speed){
        speed_Kph = Speed;

    }

    public void SetFuelLevel (float Fuel){

        fuel_level = Fuel;

    }

    public void Drive(int Distance){
        distance_traveled = Distance  ;

    }

    public double getSpeedMph (){

      //  System.out.print("The speed of the car is: " );

        return   speed_Kph / 1.60934 ;


    }

    public int getDistanceKm(){     // in Kilometers

        return (int)  distance_traveled / 1000;


    }



    public int calculate_remaining_fuel (double distance){

        int fuel_consumed = (int) (distance *0.5);


        return  (int) fuel_level - fuel_consumed ;
    }


    public int get_distance_traveled(){         // to allow the subclass ElectricCar to distance traveled
        return distance_traveled;

    }




}
