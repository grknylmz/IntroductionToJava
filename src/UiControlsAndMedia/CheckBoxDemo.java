package UiControlsAndMedia;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Created by SurfacePro on 2.03.2015.
 */
public class CheckBoxDemo extends ButtonDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);
        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");
        CheckBox chckBold = new CheckBox("BOLD");
        CheckBox chckItalic = new CheckBox("ITALIC");


        paneForCheckBoxes.getChildren().addAll(chckBold, chckItalic);
        pane.setRight(paneForCheckBoxes);

        EventHandler<ActionEvent> handle = e -> {
            if(chckBold.isSelected() && chckItalic.isSelected())
                text.setFont(fontBoldItalic);
            else if (chckBold.isSelected())
                text.setFont(fontBold);
            else if(chckItalic.isSelected())
                text.setFont(fontItalic);
            else
                text.setFont(fontNormal);
        };

    chckBold.setOnAction(handle);
    chckItalic.setOnAction(handle);
        return pane;
    }






}
