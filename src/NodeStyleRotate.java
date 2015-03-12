import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class NodeStyleRotate extends Application {
    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();
        Button btOK = new Button("OKAY!");
        btOK.setStyle("-fx-border-color: aqua");
        pane.getChildren().add(btOK);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: coral ; -fx-background-color: yellow");
        Scene scene = new Scene(pane,500,500);
        primaryStage.setTitle("Title HERE!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
