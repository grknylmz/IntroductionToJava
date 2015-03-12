package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.HPos;


/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowGridPane extends Application {
    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setVgap(5.5);
        pane.setHgap(5.5);

        pane.add(new Label("First Name :"),0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("MI : "),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Last Name :"),0,2);
        pane.add(new TextField(),1,2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd,1,3);
        GridPane.setHalignment(btAdd,HPos.LEFT);
        pane.add(new Button("Click ME!"),0,4);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Name Title");
        primaryStage.show();




    }
}
