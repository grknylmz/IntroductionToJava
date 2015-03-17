package JumpingBall;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge,btShrink);

        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        borderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tits Title");
        primaryStage.show();
    }


    class EnlargeHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            circlePane.enlarge();

        }
    }
    class ShrinkHandler implements EventHandler<ActionEvent>{

            @Override
            public void handle(ActionEvent e){
                circlePane.shrink();
            }
    }

}



///Class Circle Pane
class CirclePane extends StackPane{
    private Circle circle = new Circle(50);

    public CirclePane(){
        getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
    }



    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink(){
        circle.setRadius( circle.getRadius()-2);
    }
}

