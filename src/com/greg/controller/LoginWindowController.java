package com.greg.controller;

import com.greg.EmailManager;
import com.greg.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController {

    @FXML
    private Button errorLabel;

    @FXML
    private TextField emailAddressField;

    @FXML
    private PasswordField passwordField;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlFile) {
        super(emailManager, viewFactory, fxmlFile);
    }

    @FXML
    void loginButtonAction(ActionEvent event) {
        System.out.println("Login clicked");
        viewFactory.showMainWindow();
        Stage stage = (Stage) errorLabel.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

}
