package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Gürkan on 28.2.2015.
 */
public class TimeLineDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane stackPane = new StackPane();
        Text text = new Text(20,50,"Programming is FUN!");
        text.setFill(Color.RED);
        stackPane.getChildren().add(text);

        EventHandler<ActionEvent> eventHandler = e -> {
            if(text.getText().length() != 0)
                text.setText("");
            else
                text.setText("Programming is Fun");
        };


        Timeline animation = new Timeline(new KeyFrame(Duration.millis(500),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        text.setOnMouseClicked(e-> {
            if (animation.getStatus() == Animation.Status.RUNNING)
                animation.pause();
            else
                animation.play();

        });

        Scene scene = new Scene(stackPane,300,300);
        primaryStage.setTitle("Timeline DEMO");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}