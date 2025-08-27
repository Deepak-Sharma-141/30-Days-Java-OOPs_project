package Day4_Payment_System;

public class PayPalPayment extends Payment{
    private String email;
    public PayPalPayment(double amount,String email) {
        super(amount);
        this.email=email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Paypal Payment of $ "+amount+" using email "+email);

    }
}
