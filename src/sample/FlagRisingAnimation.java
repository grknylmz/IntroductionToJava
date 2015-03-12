package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Gürkan on 28.2.2015.
 */
public class FlagRisingAnimation extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        ImageView imageView = new ImageView("trflag.gif");
        pane.getChildren().add(imageView);

        PathTransition pt = new PathTransition(Duration.millis(10000),new Line(100,200,100,0),imageView);
        pt.setCycleCount(10);
        pt.setAutoReverse(true);

        pane.setOnMousePressed(event -> pt.play());
        pane.setOnMouseReleased(event -> pt.pause());

        Scene scene = new Scene(pane);
        primaryStage.show();
        primaryStage.setTitle("Flag");
        primaryStage.setScene(scene);



    }
}
