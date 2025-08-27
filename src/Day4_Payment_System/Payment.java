package Day4_Payment_System;

abstract class Payment {
    protected double amount;

    public Payment(double amount){
        this.amount=amount;
    }

    public abstract void processPayment();

    public void paymentDetails(){
        System.out.println("Payment amount $"+amount);
    }
}
