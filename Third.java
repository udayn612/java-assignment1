/*
 *Program that accepts a word as input and checks for each single
 * character letter in the word whether it is a consonant or vowel.
 * */

import java.util.Scanner;

public class Third {

    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("enter the string");
        String s=ob.next();
        char a[] =s.toCharArray();

        for(int i=0;i<a.length;i++)
        {
            if(isvowel(a[i]))
             System.out.println("Vowel-"+a[i]);
            else
                System.out.println("Consonent-"+a[i]);
        }

    }

    public static boolean  isvowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
