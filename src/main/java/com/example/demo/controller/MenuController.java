package com.example.demo.controller;

import com.example.demo.HelloApplication;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import com.example.demo.model.Leaderboard;
import com.example.demo.DAO.leaderboardDAO;

import java.io.IOException;

public class MenuController {

    @FXML
    private Label name;
    @FXML
    private Button close;
    @FXML
    private Button leaderboard;


    public void startGame(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) name.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pregame.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 600);
        PregameController controller = fxmlLoader.getController();
        Spinner sizeField=controller.getSizeField();
        Spinner numberOfMines=controller.getNumberOfMines();
        sizeField.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,15,8,1));
        numberOfMines.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,1,1));
        stage.setScene(scene);
    }

    public void showLeaderboard(ActionEvent actionEvent) throws IOException {
        // Loading the new scene
        name.setText("Leaderboard!");
        Stage stage = (Stage) leaderboard.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("leaderboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 600);


        leaderBoardController controller = fxmlLoader.getController();

        // Filling the table
        ObservableList<Leaderboard> list = leaderboardDAO.findAll();

// Set the items to the TableView
        controller.getTableView().setItems(list);

// Create and configure columns
        TableColumn<Leaderboard, String> nameCol = new TableColumn<>("Név");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Leaderboard, Integer> scoreCol = new TableColumn<>("Pontszám");
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("score"));

// Add columns to the TableView
        controller.getTableView().getColumns().addAll(nameCol, scoreCol);
        stage.setScene(scene);
    }


    public void close(ActionEvent actionEvent) {
        name.setText("Close!");
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }
}
