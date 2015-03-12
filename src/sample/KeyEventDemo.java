package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class KeyEventDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        final Text text = new Text(20,20,"A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){
                    case DOWN : text.setY(text.getY()+10);
                        break;
                    case UP : text.setY(text.getY()-10);
                        break;
                    case LEFT : text.setX(text.getX() - 10);
                        break;
                    case RIGHT : text.setX(text.getX() + 10);
                        break;
                    default:
                        if (Character.isLetterOrDigit(keyEvent.getText().charAt(0)))
                            text.setText(keyEvent.getText());
                }
            }
        });

        Scene scene = new Scene(pane,100,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Key Event");
        primaryStage.show();

        text.requestFocus();

    }
}
