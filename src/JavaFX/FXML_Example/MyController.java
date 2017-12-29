package JavaFX.FXML_Example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class MyController implements Initializable {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void okAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Click ok button : " + username.getText());

    }

    public void cancelAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Click cancel button : " + password.getText());

    }
}
