package dam.mp3.uf5.introgamesfx;


import dam.mp3.uf5.introgamesfx.config.WindowSettings;
import dam.mp3.uf5.introgamesfx.control.PilotaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class MainApp extends Application {
    Scanner sc = new Scanner(System.in);
    String fxml;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        FXMLLoader loader;
        fxml = "fxml/pilota-window.fxml";
        loader = new FXMLLoader(MainApp.class.getResource(fxml));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene sc = new Scene(root, WindowSettings.WIDTH, WindowSettings.HEIGHT);

        PilotaController window = loader.getController();
        window.setScene(sc);

        stage.setScene(sc);
        stage.setTitle("Exemple Games FX");
        stage.show();

    }
}
