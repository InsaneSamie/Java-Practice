import java.util.*;
class Product{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to multiply");
        int a = sc.nextInt();
        int b = sc.nextInt();

       int result = Prod(a, b);
       System.out.println("The product of " + a + " and " + " b " + " is " + result);
    }
     public static int Prod(int a, int b){
        int result = a*b;
        return result;
     }
}