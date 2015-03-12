package Recursion;

/**
 * Created by SurfacePro on 4.03.2015.
 */
public class RecursivePalindromeUsingSubstring {
    public static boolean isPalindrome(String s){
        if(s.length() <= 1)//Base Case
            return true;
        else if(s.charAt(0) != s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));

    }


    public static void main(String[] args) {
        System.out.println("Is moon a palindrome ?_");
    }
}
