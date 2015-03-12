package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * Created by Gurkan on 25.2.2015.
 */
public class CustomPane extends StackPane {
    public CustomPane (String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: coral");
        setPadding(new Insets(100,100,100,100));
    }
}
