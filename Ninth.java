/*
 *program to reverse any string without using String Buffer.
 **/

import java.util.Scanner;

public class Ninth {

    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String s=ob.next();
        String st="";
        for(int i=s.length()-1;i>=0;i--)
        {
            st=st+s.charAt(i);

        }
        System.out.print(st);
    }
}
