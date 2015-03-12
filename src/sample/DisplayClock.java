package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class DisplayClock extends Application {
    @Override
    public void start(Stage primaryStage){
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + " : " + clock.getMinute() + " : " + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);


        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();

    }
}
