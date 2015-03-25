package networking;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.border.Border;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Gürkan on 25.3.2015.
 */
public class Client extends Application {
    DataOutputStream toServer = null;
    DataInputStream fromServer = null;

    @Override
    public void start(Stage primaryStage){

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a radius : "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);

        BorderPane mainPane = new BorderPane();
        TextField ta = new TextField();
        mainPane.setCenter(new ScrollPane(ta));
        mainPane.setTop(paneForTextField);

        Scene scene = new Scene(mainPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Client");
        primaryStage.show();


        tf.setOnAction(e -> {
            try {
                double radius = Double.parseDouble(tf.getText().trim());

                toServer.writeDouble(radius);
                toServer.flush();

                double area = fromServer.readDouble();

                ta.appendText("Radius is " + radius + '\n');
                ta.appendText("Area received from server is " + area + '\n');
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        });

        try {
            Socket socket = new Socket("localhost" , 8000);
            //Socket socket = new Socket("drake.Armstrong.edu",8000);

            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException ex){
            ta.appendText(ex.toString());
        }
    }
}
