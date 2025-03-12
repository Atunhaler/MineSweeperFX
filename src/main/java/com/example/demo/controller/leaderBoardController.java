package com.example.demo.controller;

import com.example.demo.HelloApplication;
import com.example.demo.model.Leaderboard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class leaderBoardController {
    @FXML
    private TableView tableView;


    public TableView<Leaderboard> getTableView() {
        return tableView;
    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader MenuLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(MenuLoader.load(), 480, 600);
        Stage stage = (Stage) tableView.getScene().getWindow();
        stage.setTitle("MineSweeperFX!");
        stage.setScene(scene);
    }
}
