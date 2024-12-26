package com.example.final1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        stage.setFullScreen(true);
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1530, 800);
        stage.setScene(scene);
        stage.show();
        MainMenu controller = fxmlLoader.getController();
        controller.setStage(stage);
    }


    public static void main(String[] args) {
        launch();
    }
}