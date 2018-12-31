/*
* program which accepts a number as input and check
* whether the given number is palindrome or not.
* If it is a palindrome then
* a. Add all the even numbers and check whether the sum is more than 25.
8 b. Print success and failure messages for all 3 conditions.
 */

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class First {

    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        StringBuilder st=new StringBuilder();
        System.out.println("Enter the input number");
        String s=ob.next();
        st.append(s);
        st=st.reverse();

        String s1=st.toString();

        if(s.equals(s1))
        {
            System.out.println("pallindrome");
            long n=Long.parseLong(s);
            long sum=0;
            long temp;
            while(n>0)
            {
                 temp=n%10;
                 if(temp%2==0)
                 {
                     sum=sum+temp;
                 }
                 n=n/10;
            }
              if(sum>25) {
                  System.out.println("the sum of even numbers is" + sum+" and is greater than 25");
              }
              else
              {
                  System.out.println("the sum of even numbers is" + sum+" and is lesser than 25");
              }
        }
        else
        {
            System.out.println("Not a pallindrome");
        }
    }
}
