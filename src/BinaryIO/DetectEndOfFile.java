package BinaryIO;

import java.io.*;

/**
 * Created by Gürkan on 4.3.2015.
 */
public class DetectEndOfFile {
    public static void main(String[] args)throws Exception {
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))){
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
        }
        try(DataInputStream input = new DataInputStream(new FileInputStream("temp.data"))){
            while (true){
                System.out.println(input.readDouble());
            }
        }
        catch (EOFException ex) {
            System.out.println("All data were read");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
