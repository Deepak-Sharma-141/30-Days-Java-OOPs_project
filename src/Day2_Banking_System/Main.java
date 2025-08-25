package Day2_Banking_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();

        bank.addAccount(new BankAccount());
        bank.addAccount(new BankAccount("1001","Deepak Sharma"));
        bank.addAccount(new BankAccount("1002","Aman Verma",5000));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-------BANKING SYSTEM-------");
            System.out.println("1. Show all Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");


            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bank.showAllAccounts();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNumDeposit = scanner.nextLine();
                    BankAccount depositAcc = bank.findAccount(accNumDeposit);
                    if (depositAcc != null) {
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String accNumWithdraw = scanner.nextLine();
                    BankAccount withdrawAcc = bank.findAccount(accNumWithdraw);
                    if (withdrawAcc != null) {
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        withdrawAcc.withdraw(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        scanner.close();
    }
}
