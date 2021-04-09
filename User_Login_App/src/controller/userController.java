package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import model.userModel;
import dbConnect.dbUsers;
import resource.init;

import java.awt.*;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ResourceBundle;

/**
 *
 * @author Piano Hhagens
 */
public class userController extends sceneController implements Initializable{
    @FXML private Label errorLabel;
    //@FXML private Button clearInput;
    @FXML private PasswordField loginPasswordField;
    @FXML private TextField usernameField;
    private dbUsers dblogin;

    @Override
    public void initialize(URL url, ResourceBundle re) {
        this.dblogin = init.dblogin;
    }
    @FXML
    public void onLogin(ActionEvent actionEvent) {
        String tryLoginUser = usernameField.getText();
        String tryPassword = loginPasswordField.getText();
        if (dblogin.isValidUser(tryLoginUser, tryPassword)) {
            logTried(tryLoginUser, true);
            userModel.setLoggedUser(tryLoginUser);
            System.out.println("Logged in Successful!");
            //this.returnHome(e);
        }
        else {
           logTried(tryLoginUser, false);
            errorLabel.setText("User name or password incorrect, please try again!");
            errorLabel.setVisible(true);
        }
    }
    public void onClearInput(ActionEvent actionEvent) {
        usernameField.setText("");
        loginPasswordField.setText("");
    }
@FXML
    private void logTried(String tryLoginUser, boolean successful) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String successString = "unsuccessful";
        if (successful) {
            successString = "successful";
        }
    }

}
