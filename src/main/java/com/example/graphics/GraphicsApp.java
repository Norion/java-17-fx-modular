package com.example.graphics;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GraphicsApp extends Application {


    @Override
    public void start(Stage primaryStage) {
        try {
            //Setup Primary Stage
            FXMLLoader loader = new FXMLLoader(getClass().getResource("graphics.fxml"));
            Scene scene = new Scene(loader.load(),600,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
