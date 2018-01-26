package sample;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javax.swing.text.NumberFormatter;


import javax.xml.soap.Text;

public class Controller {

    @FXML
    public Text BankAccount;

    @FXML
    public Label checking;

    @FXML
    public Label savings;

    public void checkingBal(ActionEvent); {
        BankAccount.setNodeValue(checkingBal(double)
    }
}

