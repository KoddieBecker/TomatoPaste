package sample;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
// else/if loop goes here?
// all of the functions of my checking and savings go here?