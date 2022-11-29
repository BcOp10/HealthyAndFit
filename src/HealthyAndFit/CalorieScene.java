package HealthyAndFit;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalorieScene extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CalorieApp.fxml"));
    
        Scene scene = new Scene(root, 602, 602);
        primaryStage.setTitle("Healthy and Fit");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}