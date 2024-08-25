// TASK 3

// ATM INTERFACE
// Create a class to represent the ATM machine.
// Design the user interface for the ATM, including options such as withdrawing, depositing, and checking the balance.
// Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
// Create a class to represent the user's bank account, which stores the account balance.
// Connect the ATM class with the user's bank account class to access and modify the account balance.
// Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
// Display appropriate messages to the user based on their chosen options and thesuccess or failure of their transactions.

import java.util.Scanner;

// ATM Interface

public class Task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 10000);
        ATM atm = new ATM(account);
        atm.start();
    }
}


class BankAccount {

    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
    }

    // Method to add money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs. " + amount + " DEPOSITED SUCCESSFULLY");
        } else {
            System.out.println("CHECK YOUR INPUT, IT SHOULD BE POSITIVE");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Rs." + amount + " WITHDRAWN SUCCESSFULLY");
        } else {
            System.out.println("CHECK YOUR INPUT, IT SHOULD BE POSITIVE");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }
}

class ATM {
    BankAccount bankAccount;
    Scanner sc = new Scanner(System.in);

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void start() {
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("----------!!WELCOME TO THE ATM!!----------");
            System.out.print("1. CHECK BALANCE \n2. WITHDRAW MONEY \n3. DEPOSIT MONEY \n4. EXIT\nChoose an option :- ");
            int choice = sc.nextInt();
            double amount;

            switch (choice) {
                case 1 -> System.out.println("CURRENT BALANCE IS: Rs." + bankAccount.checkBalance());
                case 2 -> {
                    System.out.print("ENTER THE AMOUNT TO WITHDRAW: ");
                    amount = sc.nextDouble();
                    bankAccount.withdraw(amount);
                }
                case 3 -> {
                    System.out.print("ENTER THE AMOUNT TO DEPOSIT: ");
                    amount = sc.nextDouble();
                    bankAccount.deposit(amount);
                }
                case 4 -> {
                    System.out.println("THANK YOU FOR USING THE ATM!");
                    isRepeat = false;
                }
                default -> System.out.println("INVALID OPTION");
            }
        }
    }
}

