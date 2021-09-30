/**
 * 1972015 Andreas Yoseph Liandy
 * 1972037 Gabriel Octa Mahardika
 * 1972046 Jhonathan Oktavianus
 */

package com.example.tugaspertemuan3_1972015_1972037_1972046;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ViewTugasTeori1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}