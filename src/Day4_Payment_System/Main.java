package Day4_Payment_System;

public class Main {
    public static void main(String[] args){
        Payment credit = new CreditCardPayment(5000,"1425-1546-1254-1236");
        credit.paymentDetails();
        credit.processPayment();

        System.out.println("------------------------------- ");

        Payment paypal = new PayPalPayment(2500,"dsharma19963@gmail.com");
        paypal.paymentDetails();
        paypal.processPayment();

        System.out.println("------------------------------- ");

        Payment upi = new UPIPayment(1200,"dsharma19963@upi");
        upi.paymentDetails();
        upi.processPayment();

    }
}
