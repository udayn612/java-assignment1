/*
 * program using a loop to print the following output.
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . .
 * nth iteration.
 * */

import java.util.Scanner;

public class Fourth {
    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the input number");
        int n=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
