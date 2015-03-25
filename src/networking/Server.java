package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Gürkan on 25.3.2015.
 */
public class Server extends Application {
    @Override
    public void start(Stage primaryStage){

        TextArea ta = new TextArea();

        Scene scene = new Scene(new ScrollPane(ta),400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Server");
        primaryStage.show();


        new Thread(()-> {try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Platform.runLater(()->ta.appendText("Server Started at " + new Date() + '\n' ));
            Socket socket = serverSocket.accept();
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputFromClient = new DataOutputStream(socket.getOutputStream());

            while (true){
                double radius = inputFromClient.readDouble();
                double area = radius*radius*Math.PI;
                Platform.runLater(()->{ta.appendText("Radius received form client" + radius + '\n');
                ta.appendText("area is : " + area + '\n');
                });
            }
        }

        catch (IOException ex){
            ex.printStackTrace();
        }
        }).start();




    }
}
