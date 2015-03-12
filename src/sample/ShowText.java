package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowText extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        Text text1 = new Text(20,20,"Programming is Fun!");

        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        pane.getChildren().add(text1);

        Text text2 = new Text(60,60,"Programmin is \n Fun!!");
        pane.getChildren().add(text2);

        Text text3 = new Text(100,100,"Programming\n is FUUN!");
        text3.setFill(Color.AQUA);
        text3.setStroke(Color.ALICEBLUE);
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 35));
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Primary Title");
        primaryStage.show();







    }
}
