package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class AnonymousHandlerDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btNew = new Button("New");
        Button btOpen = new Button("Save");
        Button btEdit = new Button("Edit");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btEdit,btNew,btOpen,btPrint);

        btNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process New");
            }
        });

        btEdit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Edit");
            }
        });

        btOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Open");
            }
        });

        btPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Print");
            }
        });

        Scene scene = new Scene(hBox,300,50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Anonymous Handler");
        primaryStage.show();


    }
}
