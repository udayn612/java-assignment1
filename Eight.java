/*
 * Program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
 * User should guess until the the target number is guessed correctly.
 * */

import java.util.Scanner;

public class Eight {

    public static void main(String args[])
    {

        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the number between 1 and 50");
        int number=ob.nextInt();
        int random = (int)(Math.random() * 50 + 1);
        System.out.println("Random number genearted is "+random);
        while(random!=number)
        {
            if(random>number)
                System.out.println("Guessed number is lesser");
            else
                System.out.println("Guessed number is greater");

            System.out.println("Enter the number between 1 and 50");
             number=ob.nextInt();
        }
        System.out.println("Guessed number is equal");
    }

}
