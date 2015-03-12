package UiControlsAndMedia;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Created by SurfacePro on 2.03.2015.
 */
public class RadioButtonDemo extends  ButtonDemo {
    @Override
    protected BorderPane getPane(){
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-width: 2px ; -fx-border-color: green ; -fx-border-radius: inherit" );
        paneForRadioButtons.setVisible(true);
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbBlue = new RadioButton("Blue");

        paneForRadioButtons.getChildren().addAll(rbBlue,rbGreen,rbRed);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup toggleGroup = new ToggleGroup();
        rbBlue.setToggleGroup(toggleGroup);
        rbGreen.setToggleGroup(toggleGroup);
        rbRed.setToggleGroup(toggleGroup);

        rbBlue.setOnAction(e-> {
            if(rbBlue.isSelected())
                text.setFill(Color.RED);
                });

        rbGreen.setOnAction(e-> {
            if(rbGreen.isSelected())
                text.setFill(Color.GREEN);
        });

        rbRed.setOnAction(e-> {
            if(rbRed.isSelected())
                text.setFill(Color.GREEN);
        });


        return pane;

    }
}
