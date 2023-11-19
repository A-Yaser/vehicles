package vehicle;

import java.util.ArrayList;
import java.util.List;

 public  class Factory {

    public List<Vehicle> vehicles;
    public Factory(){
     vehicles= new ArrayList<Vehicle>();
    }

    public void addVehicle(int year, String color, String model){
        Vehicle vehicle= new Vehicle(year, color, model);
        vehicle.vehicleInfo();
    }



     public void addCar(int year, String color, String model, String tiresType,String bodyStyle){
         Car car= new Car(year, color, model, tiresType,bodyStyle);
         vehicles.add(car);
         car.vehicleInfo();
     }

     public void addMotorCycle(int year, String color, String model, double tankSize, int maxSpeed){
         MotorCycle motorCycle= new MotorCycle(year, color, model, tankSize, maxSpeed);
         vehicles.add(motorCycle);
         motorCycle.vehicleInfo();
     }



}
