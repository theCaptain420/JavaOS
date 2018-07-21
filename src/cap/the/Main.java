package cap.the;

import cap.the.Other.WindowSize;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    WindowSize windowSize;
    @Override
    public void start(Stage stage) throws Exception{
        windowSize = new WindowSize();
        Parent root = FXMLLoader.load(getClass().getResource("JavaOSHome.fxml"));
        stage.setTitle("JavaOS");
        stage.setScene(new Scene(root, windowSize.getX(), windowSize.getY()));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
