package UiControlsAndMedia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.EventListener;

/**
 * Created by SurfacePro on 2.03.2015.
 */
public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "Programming is Fun!");

    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left", new ImageView("UiControlsAndMedia/left.png"));
        Button btRight = new Button("Right", new ImageView("UiControlsAndMedia/right.png"));

        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(text);


        btLeft.setOnDragDetected(e->text.setFont(Font.font(60)));

        btLeft.setOnAction(e -> text.setY(text.getY() - 10));
        btRight.setOnAction(e ->text.setY(text.getY() + 10));

        return pane;
    }

        @Override
        public void start (Stage primaryStage){

            Scene scene = new Scene(getPane(),450,200);
            primaryStage.setTitle("Button Demo");
            primaryStage.setScene(scene);
            primaryStage.show();

            ////TODO Buttons wont work!
        }
    }

