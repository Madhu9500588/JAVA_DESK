/*if else using comparison operator*/

import java.util.Scanner;

class ex
{
    public static void main(String[] args)
    {
    Scanner num = new Scanner(System.in);
    
    int n1 = num.nextInt();
    int n2 = num.nextInt();

    System.out.println("Number 1 is :" +n1);
    System.out.println("Number 2 is:" +n2);

       if(n1>n2)
       {
        System.out.println(n1+ "is greater");
       }

       else{
        System.out.println(n2+ "is greater");
       }


       if(n1==n2)
       {
        System.out.println("Both the given numbers are equal");
       }

       else
       {
        System.out.println("Both the given numbers are not equal");
     }

     num.close();
    }
}