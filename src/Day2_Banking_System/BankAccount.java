package Day2_Banking_System;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(){
        this.accountNumber="00000";
        this.holderName="Unknown";
        this.balance=0.0;

    }

    public BankAccount(String accountNumber,String holderName){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=0.0;
    }

    public BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposited $"+amount+" |New Balance: $"+balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrew $"+amount +" | New balance: $"+balance);
        }else {
            System.out.println("Invalid withdrawal amaount or insufficient balance");
        }
    }

    public void dispalyAccount(){
        System.out.println("Account: "+accountNumber+" |Holder: "+holderName+" |Balance: "+balance);
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


}
