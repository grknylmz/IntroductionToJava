package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Effect;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class HandleEvent extends Application {
    @Override
    public void start(Stage primaryStage){

        HBox pane = new HBox();

        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK!");
        Button btCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        btOK.setAlignment(Pos.CENTER_RIGHT);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        btCancel.setAlignment(Pos.CENTER_LEFT);
        btCancel.mouseTransparentProperty();
        Insets inset = new Insets(10,10,10,10);
        pane.setPadding(inset);
        btOK.fire();
        btOK.effectProperty();
        pane.getChildren().addAll(btCancel, btOK);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Event Handle");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle (ActionEvent e){
        System.out.println("OK Button Clicked!");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public  void handle(ActionEvent e){
        System.out.println("Cancel button clicked!");


    }
}
