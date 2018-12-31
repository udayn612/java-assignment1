/*
 * Program that takes a character from the user as input and determines whether
 * the character entered is a capital letter, a small case letter, a digit or
 * a special symbol and display appropriately.
 * */


import java.util.Scanner;

public class Sixth {
    public static void main(String args[])
    {
        System.out.println("Enter the character you want to check");
        Scanner ob =new Scanner(System.in);
        char c=ob.next().charAt(0);
        if(Character.isUpperCase(c))
        {
            System.out.println("Capital letter");
        }
        else if(Character.isLowerCase(c))
        {
            System.out.println("small case letter");
        }
        else if(Character.isDigit(c))
        {
            System.out.println("digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}
