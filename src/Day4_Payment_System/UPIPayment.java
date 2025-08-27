package Day4_Payment_System;

public class UPIPayment extends Payment{
    private String UpiId;
    public UPIPayment(double amount,String UpiId) {
        super(amount);
        this.UpiId=UpiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment of $ "+amount+" using email "+UpiId);

    }
}
