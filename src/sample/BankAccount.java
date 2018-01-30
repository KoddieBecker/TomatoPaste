package sample;


public class BankAccount {

    public double balance;

    public BankAccount(double balancebA) {
        this.balance = balancebA;
        System.out.println("Bank Account Balance $" + balancebA);
    }

    public double deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Deposit in the amount $ " + this.balance);
        return this.balance;

    }

    public double withdraw(double amount) {
        this.balance = this.balance - amount;
        System.out.println("Withdraw in the amount $" + amount + "new balance $" + this.balance);
        return this.balance;
    }


}
// else/if loop goes here?
// all of the functions of my checking and savings go here?v