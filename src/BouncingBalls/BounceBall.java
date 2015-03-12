package BouncingBalls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by SurfacePro on 11.03.2015.
 */
public class BounceBall extends Application {
    @Override

    public void start(Stage primaryStage){
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+");
        Button btSubstract = new Button("-");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd,btSubstract);
        hBox.setAlignment(Pos.CENTER);

    }
}
