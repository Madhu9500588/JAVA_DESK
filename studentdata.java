


import java.util.Scanner;

class q3{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        String c =scan.nextLine();

        System.out.println("My name is " + a);
        System.out.println("My Score is " +b/10);
        System.out.println("My Department is :"+c);
 

        scan.close();
    }
}