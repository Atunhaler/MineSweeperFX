package com.example.demo.DAO;

import com.example.demo.model.Leaderboard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class leaderboardDAO {

    public static ObservableList<Leaderboard> findAll(){
        ObservableList<Leaderboard> list = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:LeaderBoard");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM leaderboard ORDER BY Score DESC");
             ){
            while(rs.next()){
                Leaderboard obj = new Leaderboard(rs.getString("name"), rs.getInt("score"));

                list.add(obj);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return list;
    }

}
