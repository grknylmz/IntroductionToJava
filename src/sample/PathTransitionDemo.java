package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Gürkan on 28.2.2015.
 */
public class PathTransitionDemo extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(0,0,25,50);
        rectangle.setFill(Color.ORANGE);

        Circle circle = new Circle(125,100,50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle,rectangle);
        final PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(circle);
        pathTransition.setNode(rectangle);
        pathTransition.setOrientation(PathTransition.OrientationType.NONE);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();



        circle.setOnMousePressed(event -> pathTransition.pause());

        circle.setOnMouseReleased(event -> pathTransition.play());

        Scene scene = new Scene(pane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Path Transition");
        primaryStage.show();
    }
}
