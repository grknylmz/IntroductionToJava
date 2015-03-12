package sample;

/**
 * Created by Gurkan on 25.2.2015.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ShowCircleCentered extends Application {

    @Override
    public void start(Stage primaryStage){

        Pane pano = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pano.widthProperty().divide(2));
        circle.centerYProperty().bind(pano.widthProperty().divide(2));
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.ALICEBLUE);
        pano.getChildren().add(circle);

        Scene scene = new Scene(pano,300,300);
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
