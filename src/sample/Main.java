package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bank Account");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {

        SavingsAccnt savings = new SavingsAccnt(0);
        savings.deposit(500);
        savings.withdraw(550);

        savings.compoundInterest();

        CheckingAccnt checking = new CheckingAccnt(0);
        checking.deposit(500);
        checking.withdraw(550);



    }
}
//In my notes, I have my variables gp in main. Do they go here or in BankAccount?
