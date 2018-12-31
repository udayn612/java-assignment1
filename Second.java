/*
 * program which accepts an integer number as input from the user
 * and perform the following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
/**/

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();

        if(20<n && n<30)
        {
            if(n%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
        else
        {
            System.out.println("doesnt exist between 20 and 30");
        }
    }

}
