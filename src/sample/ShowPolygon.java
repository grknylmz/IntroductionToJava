package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.shape.Polygon;

import java.util.Observable;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowPolygon extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);
        polygon.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        polygon.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
        ObservableList<Double> list = polygon.getPoints();

        final double width = 200 , height = 200;
        double centerX = width/2 , centerY = height/2;
        double radius = Math.min(width,height)*0.4;

        for ( ;  ; ) {
          list.add(centerX + radius * Math.cos(Math.random()));
          list.add(centerY + radius * Math.sin(Math.random()));
            int count = 0;
            count++;
            if(count == 1000)
                break;
        }


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Polygon!");
        primaryStage.show();




    }
}
