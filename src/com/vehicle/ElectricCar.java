package com.vehicle;
public class ElectricCar extends Car{

    private double BatteryLevel;


    public void setBatteryLevel (double Battery){
        BatteryLevel = Battery ;

    }

    public double getBatteryLevel(){
        return BatteryLevel;
    }


    public void Drive(int Distance){
      //  int distance = (get_distance_traveled() / 1000);
        super.Drive(Distance);


    }


    public int calculate_remaining_battery (double distance){

        int Battery_Consumed = (int) (distance /10);
      //System.out.print( " Remaining Fuel Level");
        return (int) (int)  (BatteryLevel - Battery_Consumed) ;
    }


}
