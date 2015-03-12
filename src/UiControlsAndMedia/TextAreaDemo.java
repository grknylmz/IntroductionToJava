package UiControlsAndMedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Gürkan on 2.3.2015.
 */
public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage){

        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitle("Canada");
        String description = new String("The Canadian National Flag....");
        descriptionPane.setDescription(description);


        Scene scene = new Scene(descriptionPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Description Pane");
        primaryStage.show();

    }
}
