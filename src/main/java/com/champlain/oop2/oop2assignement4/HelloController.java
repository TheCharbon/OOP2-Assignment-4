package com.champlain.oop2.oop2assignement4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onExitButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}