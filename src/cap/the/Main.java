package cap.the;

import cap.the.Browser.Browser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("JavaOS");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
