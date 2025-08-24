package Day1_Car_Rental_System;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        CarRentedSystem rentedSystem = new CarRentedSystem();

        rentedSystem.addCar(new Car("Toyota","Corolla",2000));
        rentedSystem.addCar(new Car("Honda","Civic",2500));
        rentedSystem.addCar(new Car("Toyota","Fortuner",3000));
        rentedSystem.addCar(new Car("Maruti","Suziki",1000));
        rentedSystem.addCar(new Car("Mahindra","Scorpio",2700));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n------------Car Rental System-------------");
            System.out.println("1. Show Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.println("ENTER YOUR CHOICE");
            choice =scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    rentedSystem.showAvailableCars();
                    break;
                case 2:
                    System.out.println("Enter car model to rent");
                    String rentModel = scanner.nextLine();
                    Car rentCar = rentedSystem.findCar(rentModel);
                    if(rentCar!=null){
                        rentCar.rentCar();
                    }else{
                        System.out.println("CAR NOT FOUND");
                    }
                    break;
                case 3:
                    System.out.println("Enter car model to return");
                    String returnModel = scanner.nextLine();
                    Car returnCar = rentedSystem.findCar(returnModel);
                    if(returnCar!=null){
                        returnCar.returnCar();
                    }else{
                        System.out.println("Car not found");
                    }
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING CAR RENTAL SYSTEM");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=4);
        scanner.close();


    }
}
