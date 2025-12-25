package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public void onSignUpClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("signup-view.fxml")
        );
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onHelloButtonClick(ActionEvent event) {
        System.out.println("Sign In clicked");
        // later open SignIn page here
    }
}
