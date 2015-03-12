package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowBorderPane extends Application {
    @Override
    public void start(Stage primaryStage){

        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Top!"));
        pane.setBottom(new CustomPane("Bottom!"));
        pane.setCenter(new CustomPane("Center!"));
        pane.setLeft(new CustomPane("LEFT!"));

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("ShowBorderPane!");
    }
}
