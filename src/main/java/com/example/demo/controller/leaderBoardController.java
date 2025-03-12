package com.example.demo.controller;

import com.example.demo.model.Leaderboard;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class leaderBoardController {
    @FXML
    private TableView tableView;


    public TableView<Leaderboard> getTableView() {
        return tableView;
    }
}
