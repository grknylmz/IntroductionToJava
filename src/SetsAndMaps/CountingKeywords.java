package SetsAndMaps;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Gurkan on 12.03.2015.
 */
public class CountingKeywords {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a Java Source File");
        String fileName = input.nextLine();

        File file = new File(fileName);
        if(file.exists()){
            System.out.println("Number of keywords in " + fileName + "is" +countKeywords(file));
        }
        else System.out.println("File " + fileName + "does not exists");
    }


    public static int countKeywords(File file){
        String[] keywordString = {"abstract","assert" ,"boolean", "break", "byte" , "case" , "catch", "char " , "class", "const" , "continue" , "default"
        ,"do" , "double" , "else" , "enum" , "extends"};

        Set<String > keywordSet = new HashSet<>(Arrays.asList(keywordString));
        System.out.println(keywordSet);

        int count = 0;

        while (input.hasNext()){
            String word= input.next();
            if (keywordSet.contains(word))
                count++;

        }
        return count;

    }
}
