package library.main.librarymanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import library.main.librarymanagementsystem.application.LibraryController;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    String user = "admin";
    String pass = "admin";

    @FXML
    private PasswordField tPassword;

    @FXML
    private TextField tUsername;


    @FXML
    protected void onStartButtonClick() throws IOException {
        String name = tUsername.getText();
        String passw = tPassword.getText();
        if (name.isEmpty()||passw.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please Enter Correct Username/Password");
            alert.showAndWait();
        }
        else{
            if(name.equals(user)&&passw.equals(pass)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("Successfully login");
                alert.showAndWait();
                LibraryController.changeScene();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Please Enter Correct Username/Password");
                alert.showAndWait();
            }
        }
    }
    @FXML
    protected void Cancel(ActionEvent e) {
        tUsername.setText("");
        tPassword.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}