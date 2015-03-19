package MultithreadingAndParallelProgramming;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 19.03.2015.
 */
public class FlashText extends Application {
    private String text = "";

    @Override

    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        Label lblText = new Label("Programming is Fun!");
        pane.getChildren().add(lblText);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true){
                        if(lblText.getText().trim().length() == 0)
                            text = "Welcome";
                        else
                            text= "";
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblText.setText(text);
                            }
                        });
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        Scene scene = new Scene(pane , 200 ,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Flash Text");
        primaryStage.show();

    }
}
