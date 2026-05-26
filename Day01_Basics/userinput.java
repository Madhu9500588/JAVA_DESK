import java.util.Scanner;

class q1{
    public static void main(String args[]) {

        Scanner data1 = new Scanner(System.in);
        
        String a= data1.nextLine();
        int b= data1.nextInt();

        System.out.println("MY Name is :" +a);
        System.out.println("MY Age is:"+ b);

        data1.close();
    }
}
