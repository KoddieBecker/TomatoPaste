package sample;

public class CheckingAccnt extends BankAccount {

    public CheckingAccnt( double balance) {
        super (balance);

    } @Override
            public double withdraw(double amount) {
            double overDraw = 25;
            if (amount > this.balance) {
                this.balance = this.balance - amount;
                this.balance = this.balance - overDraw;
                System.out.println("Checking Account is Over Drawn $" + amount + "New Balance is $ " + this.balance);
                return this.balance;
            }

            this.balance = this.balance - amount;
        System.out.println("Checking Account withdraw has been made, new balance: $" + this.balance);
            return this.balance;

    }




}


