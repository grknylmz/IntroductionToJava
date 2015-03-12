package Recursion;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Gurkan on 5.03.2015.
 */
public class DirectorySize {
    public static void main(String[] args) {

        System.out.println("Enter a directory or a file");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        System.out.println(getSize(new File(directory)) + " mbytes ");
        System.out.println(new File(directory).getUsableSpace());
    }

    public static long getSize(File file) {
        long size = 0;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]);



            }
        } else {
            size += file.length();
        }
        return size;
    }
}
