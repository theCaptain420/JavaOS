package cap.the.ControllerView;


import cap.the.Home.Wallpaper;
import cap.the.Other.WindowSize;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Wallpaper wallpaper = new Wallpaper();
    WindowSize windowSize = new WindowSize();



    //wallpaper
    @FXML
    private ImageView imgV_wallpaper;


    //wallpaper
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File(wallpaper.getwallpaper());
        Image image = new Image(file.toURI().toString(),600,340,false,false);
        System.out.println(image.getHeight());
        imgV_wallpaper.setImage(image);
    }
}
