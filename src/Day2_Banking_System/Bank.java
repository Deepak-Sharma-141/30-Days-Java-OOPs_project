package Day2_Banking_System;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank(){
        accounts=new ArrayList<>();
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount acc : accounts){
            if(acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }

    public void showAllAccounts(){
        System.out.println("\n-----BANK ACCOUNTS-----");
        for(BankAccount acc :accounts){
            acc.dispalyAccount();
        }
    }
}
