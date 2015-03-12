package sample;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class MouseEventDemo2 extends Application {
    @Override
    public void start(Stage primaryStage){
        final GridPane pane = new GridPane();
        final Text text = new Text(20,20,"Programming is Fun! ");
        pane.getChildren().add(text);

        text.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int clickCount = mouseEvent.getClickCount();
                for (int i = 0; i < clickCount ; i++) {
                    pane.add(new Label("Mouse Clicked!"), (int)(Math.random()*10), clickCount*((int)(Math.random()*10)));
                }





            }
        });


        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("Mouse Events");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
