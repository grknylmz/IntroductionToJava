package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class ShowHBox extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        pane.setTop(getHbox());
        pane.setLeft(getVBoc());


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hbox ve Vbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox getHbox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Java"));
        ImageView imageView = new ImageView(new Image("/code-01.gif"));
        hBox.getChildren().add(imageView);


        return hBox;

    }

    private VBox getVBoc(){
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,15,15,15));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("Mat"),new Label("Kimya"),new Label("Geo"),new Label("Fiz")};

        for(Label course: courses){
            vBox.setMargin(course,new Insets(0,0,0,15));
            vBox.getChildren().add(course);

        }
        return vBox;

    }


}



