package JumpingBall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * Created by Gürkan on 28.2.2015.
 */
public class BallControl extends Application{
    @Override
    public void start(Stage primaryStage){
        BallPane ballPane = new BallPane();

        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        ballPane.setOnKeyPressed(e-> {
            if(e.getCode() == KeyCode.UP )
                ballPane.increaseSpeed();
            if (e.getCode() == KeyCode.DOWN)
                ballPane.decreaseSpeed();
        });

        Scene scene = new Scene(ballPane,400,400);
        primaryStage.setTitle("Bouncing Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
