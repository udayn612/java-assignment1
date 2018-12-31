
/*

*Program that reads an unspecified number of integer
*
*arguments using Scanner Class and adds them together.
*
*/
import java.util.Scanner;

public class Fifth {

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int sum=0;
         System.out.println("Enter the number");  
        while(ob.hasNextInt())
        {
            System.out.println("Enter the number");
           sum+=ob.nextInt();
        }
        System.out.println(sum);
    }

}
