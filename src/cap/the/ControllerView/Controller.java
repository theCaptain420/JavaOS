package cap.the.ControllerView;


import cap.the.Home.Wallpaper;
import cap.the.Other.WindowSize;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Wallpaper wallpaper = new Wallpaper();
    WindowSize windowSize = new WindowSize();



    //wallpaper
    @FXML
    private ImageView imgV_wallpaper;

    //web
    @FXML
    private WebView webView;

    @FXML
    private Button btn_goto;

    @FXML
    private javafx.scene.control.TextField txtfield_webs;



    @FXML
    private void handleButtonAction(ActionEvent e){
        if(e.getSource()==btn_goto){
            System.out.println("test btn");
            WebEngine webEngine = webView.getEngine();
            String url = "www.google.com";
            try {
                url = txtfield_webs.toString();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            webEngine.load(url);

        }
    }

    //wallpaper
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File(wallpaper.getwallpaper());
        Image image = new Image(file.toURI().toString(),600,340,false,false);
        System.out.println(image.getHeight());
        imgV_wallpaper.setImage(image);
    }
}
