package Day1_Car_Rental_System;

import java.util.ArrayList;
import java.util.List;

public class CarRentedSystem {
    private List<Car> cars;

    public CarRentedSystem(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void showAvailableCars(){
        System.out.println("\n--------Available Cars---------");
        boolean found =false;
        for(Car car : cars){
            if(car.isAvailable()){
                System.out.println(car);
                found=true;
            }
        }

        if(!found){
            System.out.println("NO cars available right now");
        }
    }

    public Car findCar(String model){
        for(Car car : cars){
            if(car.getModel().equalsIgnoreCase(model)){
                return car;
            }
        }
        return null;
    }
}
