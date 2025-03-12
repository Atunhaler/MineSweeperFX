package com.example.demo.controller;

import com.example.demo.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PregameController {

    @FXML
    public Button backToMenu;
    @FXML
    public Button startGameButton;
    @FXML
    public Spinner numberOfMines;
    @FXML
    public Spinner sizeField;

    @FXML



    public void startGame(ActionEvent actionEvent) {




    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader MenuLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(MenuLoader.load(), 480, 600);
        Stage stage = (Stage) backToMenu.getScene().getWindow();
        stage.setTitle("MineSweeperFX!");
        stage.setScene(scene);
    }

    public Spinner getSizeField() {
        return sizeField;
    }
    public Spinner getNumberOfMines() {
        return numberOfMines;
    }
}
