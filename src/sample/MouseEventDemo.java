package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class MouseEventDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        final Text text = new Text(20,20,"Programming is Fun! ");
        pane.getChildren().add(text);
        text.setOnMouseDragged(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent e) {
                text.setX(e.getX());
                text.setY(e.getY());
            }
        });

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("Mouse Events");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
