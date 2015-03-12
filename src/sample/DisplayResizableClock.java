package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class DisplayResizableClock extends Application {
    @Override
    public void start(Stage primaryStage){

        final ClockPane clockPane = new ClockPane();
        String timeString = clockPane.getHour()+":"+clockPane.getMinute()+":"+clockPane.getSecond();
        Label lblCurrentTime = new Label(timeString);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(clockPane);
        borderPane.setBottom(lblCurrentTime);
        borderPane.setAlignment(lblCurrentTime, Pos.CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Resizable Clock");
        primaryStage.show();


        borderPane.heightProperty().addListener(heightListener -> clockPane.setW(clockPane.getWidth()) );
        borderPane.widthProperty().addListener(widthListener -> clockPane.setW(clockPane.getWidth()) );
    }
}
