package UiControlsAndMedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Gürkan on 28.2.2015.
 */
public class LabelWithGraphic extends Application {
    @Override
    public void start(Stage primaryStage){
        ImageView imageView = new ImageView("code-01.gif");
        Label label1 = new Label("Us\n50 States",imageView);
        label1.setStyle("-fx-border-color: green ; -fx-border-width: 2");
        label1.setContentDisplay(ContentDisplay.BOTTOM);
        label1.setTextFill(Color.RED);

        Label label2 = new Label("Circle",new Circle(50,50,25));
        label2.setContentDisplay(ContentDisplay.TOP);
        label2.setTextFill(Color.ORANGE);

        Label label3 = new Label("Rectangle",new Rectangle(10,10,50,25));
        label3.setContentDisplay(ContentDisplay.RIGHT);
        label3.setTextFill(Color.BLACK);

        Label label4 = new Label("Ellipse", new Ellipse(50,50,50,25));
        label4.setContentDisplay(ContentDisplay.LEFT);

        Ellipse ellipse = new Ellipse(50,50,510,25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.WHITE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse,new Label("Java FX"));
        Label label5 = new Label("A pane inside a label",stackPane);
        label5.setContentDisplay(ContentDisplay.BOTTOM);

        HBox pane = new HBox(20);
        pane.getChildren().addAll(label1,label2,label3,label4,label5);

        Scene scene  = new Scene(pane,450,150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Label with Graphics");
        primaryStage.show();













    }
}
