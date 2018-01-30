package sample;

public class SavingsAccnt extends BankAccount {

    public SavingsAccnt(double balance) {
       super(balance);

    }

    @Override
    public double withdraw(double amount) {

    public double compoundInterest() {
        double interest = 1.06;
        this.balance = this.balance * interest;
        {

            System.out.println(" Account Balance is $" + this.balance + "New Balance with interest is $ " + this.balance);
            return this.balance;
        }
    }
}

