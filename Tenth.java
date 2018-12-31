/*
 * program for the following condition:
 * Given 2 inputs , where input1 is string and input 2 is
 * integer value, the last n characters should repeat n number
 * of times in the output String.
 * */

import java.util.Scanner;

public class Tenth {

    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the String");
        String s = ob.next();
        System.out.println("Enter the number");
        int n=ob.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String lastnchar="";
        if(s.length()>n)
        {
            lastnchar=s.substring(s.length()-n);
        }
        else
        {
            lastnchar=s;
        }
        for(int i=0;i<n;i++)
        {
            sb.append(lastnchar);
        }
        System.out.println(sb);
    }
}
