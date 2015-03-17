package JumpingBall;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javafx.scene.text.Font;



/**
 * Created by Gurkan on 25.2.2015.
 */
public class FontDemo extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setFill(new Color(0.7,0.8,0.9,0.5));
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(pane);

        Font font = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20);
        Label label = new Label();
        label.setFont(font);

    }
}
