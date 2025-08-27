package Day4_Payment_System;

public class CreditCardPayment extends Payment{
    private String cardNumber;

    public CreditCardPayment(double amount,String cardNumber) {
        super(amount);
        this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment of $ "+amount+" using card "+cardNumber);

    }
}
