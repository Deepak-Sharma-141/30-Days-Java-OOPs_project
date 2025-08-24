package Day1_Car_Rental_System;

public class Car {
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean isAvailable;

    public Car(String brand,String model,double rentalPrice){
        this.brand=brand;
        this.model=model;
        this.rentalPrice=rentalPrice;
        this.isAvailable=true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(brand+" "+model+" has been rented");
        }else{
            System.out.println(brand+" "+model+" is not available");
        }
    }

    public void returnCar(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println(brand+" "+model+" has been returned");
        }else{
            System.out.println(brand+" "+model+" was not rented");
        }
    }

    public String toString(){
        return brand+" "+model+" Price $"+rentalPrice+" per day"+(isAvailable ? " Available":" Rented");
    }
}
