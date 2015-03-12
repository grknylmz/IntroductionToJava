package UiControlsAndMedia;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * Created by SurfacePro on 2.03.2015.
 */
public class TextFieldDemo extends RadioButtonDemo {
    @Override
    protected BorderPane getPane(){
        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new Message"));

        TextField textField = new TextField();
        textField.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(textField);
        pane.setTop(paneForTextField);

        textField.setOnAction(e -> text.setText(textField.getText()));

        return pane;
    }
}
