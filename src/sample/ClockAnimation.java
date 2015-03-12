package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;



/**
 * Created by Gürkan on 28.2.2015.
 */

//TODO Clock goes backwards!
public class ClockAnimation extends Application {
    @Override
    public void start(Stage primaryStage){
        ClockPane clockPane = new ClockPane();
        EventHandler<ActionEvent> eventHandler = (e -> {
            clockPane.setCurrentTime();
        });

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        Text text = new Text();

        Scene scene =new Scene(clockPane,250,250);
        primaryStage.setTitle("Animated Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
