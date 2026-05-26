/*get 3 integers from  the user , multiply and store in it a variable , add and store in it another variable, 
divide the multiplied variable by the added variable*/


import java.util.Scanner;

class q2{
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);

        int a= data.nextInt();
        int b= data.nextInt();
        int c= data.nextInt();

        int d= (a*b*c);
        System.out.println("The Multiplied Values of a,b,c:"+d);

        int e=(a+b+c);
        System.out.println("The Added Values of a,b,c:" +e);

        float f=(d/e);
        System.out.println("The divided Value of d and e:" +f);

        data.close();
    }
}



