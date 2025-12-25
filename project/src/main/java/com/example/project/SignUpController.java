package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField repeatPasswordField;
    @FXML private Label messageLabel;

    @FXML
    public void handleSignUp() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String repeatPassword = repeatPasswordField.getText();

        // Basic validation
        if (firstName.isEmpty() || lastName.isEmpty() ||
                email.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            messageLabel.setText("All fields are required");
            return;
        }

        if (!password.equals(repeatPassword)) {
            messageLabel.setText("Passwords do not match");
            return;
        }

        if (!email.contains("@")) {
            messageLabel.setText("Invalid email address");
            return;
        }

        messageLabel.setStyle("-fx-text-fill: green;");
        messageLabel.setText("Account created successfully!");

        // Later:
        // - save to database
        // - hash password
        // - redirect to login page
    }

    @FXML
    public void goBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view.fxml")
        );
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(scene);
        stage.show();
    }
}
