package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.awt.*;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("/lol.png");
        int height = (int) image.getHeight();
        int width = (int) image.getWidth();
        ImageView img1=new ImageView(image);
        img1.setFitHeight(height);
        img1.setFitWidth(width);
        pane.getChildren().add(img1);



        Scene scene = new Scene(pane,250,300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Fıtıııı");
        primaryStage.show();
        primaryStage.setResizable(true);
    }
}
