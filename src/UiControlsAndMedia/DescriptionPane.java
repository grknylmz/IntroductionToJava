package UiControlsAndMedia;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;



/**
 * Created by Gürkan on 2.3.2015.
 */
public class DescriptionPane extends BorderPane {
    private Label lblImageTitle = new Label();
    private TextArea taDescription = new TextArea();

    public DescriptionPane(){

        lblImageTitle.setContentDisplay(ContentDisplay.TOP);
        lblImageTitle.setPrefSize(200,100);

        lblImageTitle.setFont(new Font("Sans Serif", 16 ));
        taDescription.setFont(new Font("Serif",14));

        taDescription.setWrapText(true);
        taDescription.setEditable(true);
        setPadding(new Insets(15,15,15,15));


        ScrollPane scrollPane = new ScrollPane(taDescription);

        setLeft(lblImageTitle);
        setCenter(scrollPane);

    }


    public void setTitle(String title){
        lblImageTitle.setText(title);
    }

    public void setDescription(String text){
        taDescription.setText(text);

    }

}
