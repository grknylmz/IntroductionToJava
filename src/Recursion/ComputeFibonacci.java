package Recursion;

import java.util.Scanner;

/**
 * Created by SurfacePro on 4.03.2015.
 */
public class ComputeFibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for fibonacci number");
        int index = input.nextInt();


        System.out.println("The fibonacci number at index  = " + index + " is " + fib(index));

    }

    public static long fib(long index){
        if(index  == 0)
            return 0;
        else if(index == 1)
            return 1;
        else
            return fib(index-1)+fib(index -2 );
    }
}
